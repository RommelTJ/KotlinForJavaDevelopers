package com.rommelrico.s3ooprogramming.javacode;

public class RoadBike extends Bicycle {

    // In millimeters
    private int tireWidth;

    public RoadBike(int cadence, int gear, int speed, int tireWidth) {
        super(cadence, gear, speed);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The road bike has a tire width of " + tireWidth + "mm.");
    }

}
