package com.example.gridview;

public class Cat {

    private String name;
    private int rate;
    private int newPrice;
    private int peopleRate;
    private int imageCat;
    private int reducePercent;

    public Cat(String name, int rate, int newPrice, int peopleRate, int imageCat, int reducePercent) {
        this.name = name;
        this.rate = rate;
        this.newPrice = newPrice;
        this.peopleRate = peopleRate;
        this.imageCat = imageCat;
        this.reducePercent = reducePercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(int newPrice) {
        this.newPrice = newPrice;
    }

    public int getPeopleRate() {
        return peopleRate;
    }

    public void setPeopleRate(int peopleRate) {
        this.peopleRate = peopleRate;
    }

    public int getImageCat() {
        return imageCat;
    }

    public void setImageCat(int imageCat) {
        this.imageCat = imageCat;
    }

    public int getReducePercent() {
        return reducePercent;
    }

    public void setReducePercent(int reducePercent) {
        this.reducePercent = reducePercent;
    }
}