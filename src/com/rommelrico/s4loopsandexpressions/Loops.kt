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

    val backwardRange = 5.downTo(1)
    println(5 in backwardRange)

    // Defining other types of ranges
    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    val reversedRange = stepRange.reversed()

    // Testing the for loops
    for (i in range) {
        println(i)
    }
    for (n in stepRange) {
        println(n)
    }
    for (n in stepThree) {
        println(n)
    }
    for (n in reversedRange) {
        println(n)
    }

    val str = "Hello"
    for (c in str) {
        println(c)
    }

    // Looping inplace.
    for (num in 1..20 step 4) {
        println(num)
    }

    // Using a range directly but backwards.
    for (i in 20 downTo 15 step 5) {
        println(i)
    }

    // Excluding the last value
    for (i in 1 until 10) {
        println(i)
    }

    // Using operators in a range
    val s = "goodbye"
    val sRange = 0..s.length

    // Iterating over an array
    val seasons = arrayOf("spring", "summer", "fall", "winter")
    for (season in seasons)
        println(season)

    // Not in range
    val notASeason = "whatever" !in seasons
    println(notASeason) // true
    val notInRange = 32 !in 1..10
    println(notInRange)
    println('e' in str) // true
    println('e' !in str) // false

    // Using range indices.
    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

}