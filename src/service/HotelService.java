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

    }

    public void checkoutGuest(int roomNumber) {

    }

    public void reviewOccupancy() {

    }

    public void roomHistory() {

    }

}
