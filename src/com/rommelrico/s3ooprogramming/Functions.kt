package com.rommelrico.s3ooprogramming

fun main(args: Array<String>): Unit {
    println(labelMultiply(3, 4, "The result is: "))
}

fun labelMultiply(operand1: Int, operand2: Int, label: String): String {
    return ("$label ${operand1 * operand2}")
}

