package com.rommelrico.s7javainteroperability

import com.rommelrico.s7javainteroperability.javacode.Employee

fun main(args: Array<String>) {

    // Part 1.
    val employee = Employee("Jane", "Smith", 2000)
    employee.lastName = "Jones"
    employee.salaryLast3Years = floatArrayOf(50000.25f, 54000.60f, 56000.48f)

}
