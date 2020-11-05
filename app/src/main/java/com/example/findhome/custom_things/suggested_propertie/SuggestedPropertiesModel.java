package com.example.findhome.custom_things.suggested_propertie;

public class SuggestedPropertiesModel {
    private String name;
    private float stars;
    private float averageRating;
    private int reviewsNoumber;
    private String location;
    private int price;
    private int discoundPercentage;
    private String image;

    public SuggestedPropertiesModel() {
    }

    public SuggestedPropertiesModel(String name, float stars, float averageRating, int reviewsNoumber, String location, int price, int discoundPercentage, String image) {
        this.name = name;
        this.stars = stars;
        this.averageRating = averageRating;
        this.reviewsNoumber = reviewsNoumber;
        this.location = location;
        this.price = price;
        this.discoundPercentage = discoundPercentage;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }

    public int getReviewsNoumber() {
        return reviewsNoumber;
    }

    public void setReviewsNoumber(int reviewsNoumber) {
        this.reviewsNoumber = reviewsNoumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscoundPercentage() {
        return discoundPercentage;
    }

    public void setDiscoundPercentage(int discoundPercentage) {
        this.discoundPercentage = discoundPercentage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
