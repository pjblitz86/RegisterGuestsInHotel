package service;

import model.room.Room;
import model.guest.Guest;
import java.util.ArrayList;
import java.util.List;

public class HotelService {
    private List<Room> rooms;
    private List<Guest> guestHistory;

    public HotelService() {
        rooms = new ArrayList<>();
        guestHistory = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            rooms.add(new Room(i));
        }
    }

    public void registerGuest(String name, String surname) {
        Room availableRoom = findAvailableRoom();
        if (availableRoom != null) {
            Guest guest = new Guest(name, surname);
//            TODO check that no dublicate guest and dont allow to checkin
            availableRoom.checkIn(guest);
            guestHistory.add(guest);
            System.out.println("Guest " + name + " " + surname + " registered in room " + availableRoom.getRoomNumber());
        } else {
            System.out.println("Sorry, no rooms available at the moment.");
        }
    }

    public void checkoutGuest(int roomNumber) {

    }

    public void reviewOccupancy() {

    }

    public void roomStatus() {

    }

    public void roomHistory() {

    }

    private Room findAvailableRoom() {
        for (Room room : rooms) {
            if (room.isRoomFree()) {
                return room;
            }
        }
        return null; // No available room
    }

}
