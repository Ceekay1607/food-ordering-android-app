package com.example.food_ordering_app.domain;

public class Location {
    private int Id;
    private String loc;

    public Location() {
    }

    public int getId() {
        return Id;
    }

    public String getLoc() {
        return loc;
    }

    @Override
    public String toString() {
        return loc;
    }
}
