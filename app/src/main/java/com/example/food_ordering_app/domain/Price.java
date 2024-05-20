package com.example.food_ordering_app.domain;

public class Price {
    private int Id;
    private String Value;

    public Price() {
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
