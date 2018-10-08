package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {
    run { println("I'm in a lamdba!") }

    val employees = listOf(
            Employee("John", "Smith", 2012),
            Employee("Jane", "Wilson", 2015),
            Employee("Mary", "Johnson", 2010),
            Employee("Mike", "Jones", 2002)
    )

    // MinBy function
    println(employees.minBy { e -> e.startYear })

}

data class Employee(val firstName: String, val lastName: String, val startYear: Int)
