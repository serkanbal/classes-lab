package com.company;

/**
 * Created by Serkan on 11/10/16.
 */
public class Car {
    private String mColor;
    private String mBrand;
    private int mTopSpeed;

    public Car (String Color, String Brand, int topSpeed) {
        mColor = Color;
        mBrand = Brand;
        mTopSpeed = topSpeed;
    }

    public void go() {
        System.out.println("Car is speeding up");
    }

    public void slow() {
        System.out.println("Car is slowing down");
    }

    public void stop() {
        System.out.println("Car has stopped entirely");
    }

    //GETTERS
    public String getColor() {
        return mColor;
    }

    public String getBrand() {
        return mBrand;
    }

    public int getTopSpeed() {
        return mTopSpeed;
    }

    //SETTERS
    public void setColor(String newColor) {
        mColor = newColor;
    }

    public void setBrand(String newBrand) {
        mBrand = newBrand;
    }

    public void setTopSpeed(int newTopSpeed) {
        mTopSpeed = newTopSpeed;
    }
}



