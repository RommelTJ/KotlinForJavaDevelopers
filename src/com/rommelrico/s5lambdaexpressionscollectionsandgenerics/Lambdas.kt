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

    // Calling a top-level function from a lambda.
    run(::topLevel)

    println(countTo100())
    println(countTo100Short())
    println(countTo100Apply())

    println(findByLastName(employees, "Wilson"))
    println(findByLastName(employees, "Rico"))

    // Using labels with receiver objects.
    "Some String". apply someString@ {
        "Another String".apply {
            println(toLowerCase()) // refers to "Another String"
            println(this@someString.toUpperCase()) // refers to "Some String"
        }
    }
}

// Writing 1..100 separated by commas
fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}

// Also writing 1..100 separated by commas
// with converts the instance into a receiver and inside the lambda you don't have to refer to the receiver.
fun countTo100Short() =
    with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }

// Another type of receiver is the apply function.
fun countTo100Apply() =
        StringBuilder().apply {
            for (i in 1..99) {
                append(i)
                append(", ")
            }
            append(100)
        }.toString()

// You can access function parameters within lambdas, but you can't change them.
fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }
}

// Example using forEach and labels
fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@ {
        if (it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName.")
            return@returnBlock
        }
    }

    println("No, there's no employee with the last name $lastName.")
}

fun topLevel() = println("I'm in a function")

data class Employee(val firstName: String, val lastName: String, val startYear: Int)
