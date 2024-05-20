package com.example.food_ordering_app.domain;

public class Time {

    private int Id;
    private String Value;

    public Time() {
    }

    public int getId() {
        return Id;
    }

    public String getValue() {
        return Value;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setValue(String value) {
        Value = value;
    }

    @Override
    public String toString() {
        return Value;
    }
}
