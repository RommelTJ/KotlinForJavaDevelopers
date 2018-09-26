package com.rommelrico.s1basicdifferences;

public class SomeClass {

    public static void main(String[] args) {
        EmployeeJava e1 = new EmployeeJava("Mary", 1);
        EmployeeJava e2 = new EmployeeJava("John", 2);
        EmployeeJava e3 = new EmployeeJava("John", 2);

        System.out.println(e1 == e2); // false
        System.out.println(e2 == e3); // false
        System.out.println(e1.equals(e2)); // false
        System.out.println(e2.equals(e3)); // true
    }
}
