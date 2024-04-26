package model.room;
import model.guest.Guest;

public class Room implements IRoom {
    private final int number;
    private boolean isOccupied;
    private Guest guest;

    public Room(int number) {
        this.number = number;
        isOccupied = false;
    }

    public int getRoomNumber() {
        return number;
    }

    public boolean isRoomFree() {
        return !isOccupied;
    }

    public void checkIn(Guest guest) {
        this.guest = guest;
        isOccupied = true;
    }

    public void checkOut() {
        this.guest = null;
        isOccupied = false;
    }

    public Guest getGuest() {
        return guest;
    }
}
