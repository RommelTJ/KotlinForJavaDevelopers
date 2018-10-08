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
    // More concise because only takes one argument type.
    println(employees.minBy { it.startYear })
    // Another way
    println(employees.minBy(Employee::startYear))

    var num = 10
    run {
        num += 15
        println(num) // prints 25
    }

}

// You can access function parameters within lambdas, but you can't change them.
fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }
}

fun topLevel() = println("I'm in a function")

data class Employee(val firstName: String, val lastName: String, val startYear: Int)
