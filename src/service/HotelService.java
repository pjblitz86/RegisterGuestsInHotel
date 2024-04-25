package service;

import model.room.Room;
import model.guest.Guest;
import java.util.ArrayList;
import java.util.List;

public class HotelService {
    private final List<Room> rooms;
    private final List<Guest> registeredGuests;
    private final List<Guest> guestHistory;

    public HotelService() {
        rooms = new ArrayList<>();
        registeredGuests = new ArrayList<>();
        guestHistory = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            rooms.add(new Room(i));
        }
    }

    public void registerGuest(String name, String surname) {
        Room availableRoom = findAvailableRoom();
        if (availableRoom != null) {
            for (Guest guest : registeredGuests) {
                if (guest.getName().equalsIgnoreCase(name) && guest.getSurname().equalsIgnoreCase(surname)) {
                    System.out.println("Guest already registered with same name " + name + " and surname " + surname);
                    return;
                }
            }

            Guest guest = new Guest(name, surname);
            availableRoom.checkIn(guest);
            registeredGuests.add(guest);
            guestHistory.add(guest);
            System.out.println("Guest " + name + " " + surname + " registered in room " + availableRoom.getRoomNumber());
        } else {
            System.out.println("Sorry, no rooms available at the moment.");
        }
    }

    public void checkoutGuest(int roomNumber) {
        Room room = findRoomByNumber(roomNumber);
        if (room != null && room.isRoomFree()) {
            System.out.println("Room " + roomNumber + " is already free.");
        } else if (room != null) {
            Guest guest = room.getGuest();
            room.checkOut();
            registeredGuests.remove(guest);
            System.out.println("Guest " + guest.getName() + " " + guest.getSurname() + " checked out of room " + roomNumber);
        } else {
            System.out.println("Invalid room number. Choose between 1 and 5.");
        }
    }

    public void reviewOccupancy() {
        System.out.println("Room occupancy review:");
        for (Room room : rooms) {
            if (!room.isRoomFree()) {
                Guest guest = room.getGuest();
                System.out.println("Room " + room.getRoomNumber() + " occupied by " + guest.getName() + " " + guest.getSurname());
            }
        }
    }

    public void roomStatus() {
        System.out.println("Room status:");
        for (Room room : rooms) {
            if (room.isRoomFree()) {
                System.out.println("Room " + room.getRoomNumber() + " is available");
            } else {
                Guest guest = room.getGuest();
                System.out.println("Room " + room.getRoomNumber() + " occupied by " + guest.getName());
            }
        }
    }

    public void roomHistory() {
        System.out.println("Room history:");
        for (Guest guest : guestHistory) {
            System.out.println("Guest: " + guest.getName() + " " + guest.getSurname());
//            TODO write at which room guest stayed
        }
    }

    private Room findAvailableRoom() {
        for (Room room : rooms) {
            if (room.isRoomFree()) {
                return room;
            }
        }
        return null; // No available room
    }

    private Room findRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null; // Room not found
    }

}
