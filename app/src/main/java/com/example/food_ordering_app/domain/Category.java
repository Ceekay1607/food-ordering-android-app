package com.example.food_ordering_app.domain;

public class Category {
    private int Id;
    private String ImagePath;
    private String Name;

    public Category() {
    }

    public int getId() {
        return Id;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public String getName() {
        return Name;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public void setImagePath(String imagePath) {
        this.ImagePath = imagePath;
    }

    public void setName(String name) {
        this.Name = name;
    }
}
