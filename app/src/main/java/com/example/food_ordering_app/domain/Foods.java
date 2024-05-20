package com.example.food_ordering_app.domain;

import java.io.Serializable;

public class Foods implements Serializable {
    private int CategoryId;
    private String Description;
    private boolean BestFood;
    private int Id;
    private int LocationId;
    private double Price;
    private String ImagePath;
    private int PriceId;
    private double Star;
    private int TimeId;
    private int TimeValue;
    private String Title;
    private int numberInCart;

    public Foods() {
    }

    @Override
    public String toString() {
        return Title;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public String getDescription() {
        return Description;
    }

    public boolean isBestFood() {
        return BestFood;
    }

    public int getId() {
        return Id;
    }

    public int getLocationId() {
        return LocationId;
    }

    public double getPrice() {
        return Price;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public int getPriceId() {
        return PriceId;
    }

    public double getStar() {
        return Star;
    }

    public int getTimeId() {
        return TimeId;
    }

    public int getTimeValue() {
        return TimeValue;
    }

    public String getTitle() {
        return Title;
    }

    public int getNumberInCart() {
        return numberInCart;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setBestFood(boolean bestFood) {
        BestFood = bestFood;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setLocationId(int locationId) {
        LocationId = locationId;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    public void setPriceId(int priceId) {
        PriceId = priceId;
    }

    public void setStar(double star) {
        Star = star;
    }

    public void setTimeId(int timeId) {
        TimeId = timeId;
    }

    public void setTimeValue(int timeValue) {
        TimeValue = timeValue;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }
}
