package com.rommelrico.s7javainteroperability.javacode;

// Notice the 'Kt' at the end of the import.
import com.rommelrico.s7javainteroperability.*;

public class Main {

    public static void main(String[] args) {
        // Calling a top level Kotlin function from the Java Class.
        StaticCar.topLevel();

        // You would call extension functions in the same way.
        StaticCar.print("Print this Java");

        // Accessing properties from a Kotlin class in Java.
        KotlinCar car = new KotlinCar("blue", "BMW", 2011);
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        car.setColor("purple");
        System.out.println(car.getColor()); // prints always green.

    }

}
