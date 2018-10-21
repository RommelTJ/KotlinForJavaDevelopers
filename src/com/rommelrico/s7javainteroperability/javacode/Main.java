package com.rommelrico.s7javainteroperability.javacode;

// Notice the 'Kt' at the end of the import.
import com.rommelrico.s7javainteroperability.StaticCar;

public class Main {

    public static void main(String[] args) {
        // Calling a top level Kotlin function from the Java Class.
        StaticCar.topLevel();
    }

}
