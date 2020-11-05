package com.example.findhome.custom_things.reviews;

public class ReviewsModel {

    private int reviewsNoumber;
    private String comment;
    private String firstBenefit;
    private String secondBenefit;
    private String thirdBenefit;

    public ReviewsModel() {
    }
    public ReviewsModel(String category, int reviewsNoumber, String comment, String firstBenefit, String secondBenefit, String thirdBenefit) {
        this.category = category;
        this.reviewsNoumber = reviewsNoumber;
        this.comment = comment;
        this.firstBenefit = firstBenefit;
        this.secondBenefit = secondBenefit;
        this.thirdBenefit = thirdBenefit;
    }


    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewsNoumber() {
        return reviewsNoumber;
    }

    public void setReviewsNoumber(int reviewsNoumber) {
        this.reviewsNoumber = reviewsNoumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getFirstBenefit() {
        return firstBenefit;
    }

    public void setFirstBenefit(String firstBenefit) {
        this.firstBenefit = firstBenefit;
    }

    public String getSecondBenefit() {
        return secondBenefit;
    }

    public void setSecondBenefit(String secondBenefit) {
        this.secondBenefit = secondBenefit;
    }

    public String getThirdBenefit() {
        return thirdBenefit;
    }

    public void setThirdBenefit(String thirdBenefit) {
        this.thirdBenefit = thirdBenefit;
    }
}
