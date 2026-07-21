package com.cqu.ArrayList;

public class Phone {
    private String band;
    private double price;

    public Phone(){}
    public Phone(String band, double price) {
        this.band = band;
        this.price = price;
    }

    public String getBand() {
        return band;
    }
    public void setBand(String band) {
        this.band = band;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
