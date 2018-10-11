package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {
    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.filter { it % 2 != 0 }) // only odd numbers

    val immutableMap = mapOf(
            1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013)
    )

}
