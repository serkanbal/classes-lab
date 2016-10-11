package com.company;

public class Main {

    public static void main(String[] args) {
        StopLight myStopLight = new StopLight();
        Car myCar = new Car("Blue", "Mazda", 10);

        for (int i = 0; i < 30; i++) {
            if (myStopLight.isRed()) {
                System.out.println("The light turned: " + myStopLight.mLightColor);
                myCar.stop();
                myStopLight.setLightColor("GREEN");
            } else if (myStopLight.isGreen()) {
                System.out.println("The light turned: " + myStopLight.mLightColor);
                myCar.go();
                myStopLight.setLightColor("YELLOW");
            } else if (myStopLight.isYellow()) {
                System.out.println("The light turned: " + myStopLight.mLightColor);
                myCar.slow();
                myStopLight.setLightColor("RED");
            }

        }

    }

}
