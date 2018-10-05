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
    
}
