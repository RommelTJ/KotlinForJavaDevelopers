package com.rommelrico.s7javainteroperability.javacode;

public class Employee {

    private String firstName;
    private String lastName;
    private int startYear;
    private float[] salaryLast3Years;

    public Employee(String firstName, String lastName, int startYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startYear = startYear;
        this.salaryLast3Years = new float[3];
    }

}
