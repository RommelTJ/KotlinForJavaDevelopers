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
        System.out.println(car.getYear());

        // Adding an annotation to access property directly
        System.out.println(car.model);

        // System.out.println(car.isAutomatic());
        // car.setAutomatic(false);
        // System.out.println(car.isAutomatic());
        // car.setColor("purple");
        // System.out.println(car.getColor()); // prints always green.

        KotlinCar.Companion.carComp();
        KotlinCar.carComp(); // This works because we added the @JvmStatic annotation.

        SingletonObj.INSTANCE.doSomething(); // Instance is the single instance of the object class.
        SingletonObj.doSomething(); // This works because we added the @JvmStatic annotation.

        // System.out.println("isAuto = " + KotlinCar.Companion.isAuto()); // Accessing a private variable in comp. obj.
        System.out.println("isAuto = " + KotlinCar.isAuto); // This works because of @JvmField annotation.
        System.out.println("isAuto = " + KotlinCar.constant); // You don't have to annotation constants.

        // Passing a null value to a non-null method in Kotlin.
        // car.printMe(null); // Generates IllegalArgumentException.

        // Throwing an IOException.
        StaticCar.doIO(); // Java doesn't know the exception is thrown, so you cannot catch it.

    }

}
