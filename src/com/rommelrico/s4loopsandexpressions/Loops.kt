package com.rommelrico.s4loopsandexpressions

fun main(args: Array<String>) {
    // Ranges in Kotlin are inclusive, so it includes 1 and 5.
    val range = 1..5

    // You can also have ranges of chars and strings because they are comparable
    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"

    // Using the 'in' keyword.
    println(3 in range) // true
    println('q' in charRange) // true
    println("CCC" in stringRange) // true
    println("CCCCCC" in stringRange) // true
    println("ZZZ" in stringRange) // false

}