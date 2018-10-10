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

    // Iterating over mutable map.
    for (entry in mutableMap) {
        println(entry.key)
        println(entry.value)
    }
    // Another way using destructuring declaration
    for ((key, value) in mutableMap) {
        println(key)
        println(value)
    }

    // Using destructuring declarations with a Car class.
    // The Car Class has to implement the component functions. This is provided by the data classes.
    val car = Car("blue", "Corvette", 1959)
    val (color, model, year) = car
    println(color)
    println(model)
    println(year)

    // Sets are Immutable.
    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.plus(20))
    println(setInts.plus(10))
    println(setInts.minus(19))
    println(setInts.minus(24))
    println(setInts.average()) // prints 5.0
    println(setInts.drop(3)) // prints [5, 3, -22] i.e. drop the first 3 elements.

}

data class Car(val color: String, val model: String, val year: Int)