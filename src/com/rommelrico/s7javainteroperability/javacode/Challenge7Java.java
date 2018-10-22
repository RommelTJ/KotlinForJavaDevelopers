package com.rommelrico.s7javainteroperability.javacode;

import com.rommelrico.s7javainteroperability.kotlincode.Challenge;
import com.rommelrico.s7javainteroperability.kotlincode.Employee;
import com.rommelrico.s7javainteroperability.kotlincode.KotlinStuff;

public class Challenge7Java {

    public static void main(String[] args) {
        // Part 2.
//        KotlinStuff.sayHelloToJava("Student");
//        Employee employee = new Employee("John", "Smith", 2010);
//        employee.startYear = 2009;
//
//        Challenge.doMath(5, 4);
//
//        employee.takesDefault("arg1");

        // Part 3.
        KotlinStuff.sayHelloToJava("Student");
        Employee employee = new Employee("John", "Smith", 2010);
        employee.startYear = 2009;

        Challenge.doMath(5, 4);

    }

}
