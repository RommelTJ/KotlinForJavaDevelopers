package com.rommelrico.s7javainteroperability.javacode;

import com.rommelrico.s7javainteroperability.kotlincode.*;
import com.rommelrico.s7javainteroperability.kotlincode.Employee;

public class Challenge7Java {

    public static void main(String[] args) {
        // Part 2.
        KotlinStuff.sayHelloToJava("Student");
        Employee employee = new Employee("John", "Smith", 2010);
        employee.startYear = 2009;

        Challenge.doMath(5, 4);

        employee.takesDefault("arg1");

    }

}
