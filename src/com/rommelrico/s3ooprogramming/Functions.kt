package com.rommelrico.s3ooprogramming

fun main(args: Array<String>): Unit {
    println(labelMultiply(5, 4, "The result is: "))
    val e1 = Employee2("John")
    println(e1.upperCaseFirstName())
}

/*
fun labelMultiply(operand1: Int, operand2: Int, label: String): String {
    return ("$label ${operand1 * operand2}")
}
*/

// Shorter way
fun labelMultiply(operand1: Int, operand2: Int, label: String): String = "$label ${operand1 * operand2}"

class Employee2(val firstName: String) {
    fun upperCaseFirstName() = firstName.toUpperCase()
}