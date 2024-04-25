package model.guest;

import model.room.Room;

public class Guest {
    private final String name;
    private final String surname;

    public Guest(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
