package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "winter")
    val colorList = listOf("black", "white", "green")

    // Getting last element in a List.
    println(strings.last())
    // Reversing a list.
    println(strings.asReversed())
    // Getting an item if it exists.
    println(strings.getOrNull(5))
    println(strings.getOrNull(2))

}
