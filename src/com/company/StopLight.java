package com.company;

/**
 * Created by Serkan on 11/10/16.
 */
public class StopLight {
    String mLightColor;

    public StopLight () {
    mLightColor = "RED";
    }

    public boolean isRed() {
        boolean colorIsRed = true;
        if (mLightColor.equals("RED") == true) {
            colorIsRed = true;
        } else {
            colorIsRed = false;
        }
    return colorIsRed;
    }

    public boolean isGreen() {
        boolean colorIsGreen = true;
        if (mLightColor.equals("GREEN") == true) {
            colorIsGreen = true;
        } else {
            colorIsGreen = false;
        }
    return colorIsGreen;
    }

    public boolean isYellow() {
        boolean colorIsYellow = true;
        if (mLightColor.equals("YELLOW") == true) {
            colorIsYellow = true;
        } else {
            colorIsYellow = false;
        }
    return colorIsYellow;
    }

    //SETTER
    public void setLightColor(String newColor) {
        mLightColor = newColor;
    }
}
