package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {

    // Immutable Map in Kotlin.
    val immutableMap = mapOf(
            1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013)
    )
    println(immutableMap.javaClass) // class java.util.LinkedHashMap
    println(immutableMap)

    // Mutable Map in Kotlin.
    val mutableMap = mutableMapOf(
            "John's Car" to Car("red", "Range Rover", 2010),
            "Jane's Car" to Car("blue", "Hyundai", 2012)
    )
    println(mutableMap.javaClass) // class java.util.LinkedHashMap
    println(mutableMap)
    mutableMap.put("Mary's Car", Car("red", "Corvette", 1965))
    println(mutableMap)

    val pair = Pair(10, "ten")
    val firstValue = pair.first
    val secondValue = pair.second
    // Destructuring declarations in Kotlin
    val (first, second) = pair
    println(first) // prints 10
    println(second) // prints "ten"

}

data class Car(val color: String, val model: String, val year: Int)