package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "winter")
    val colorList = listOf("black", "white", "green")
    val ints = listOf(1, 2, 4, 6, 9, 3)

    // Getting last element in a List.
    println(strings.last())
    // Reversing a list.
    println(strings.asReversed())
    // Getting an item if it exists.
    println(strings.getOrNull(5))
    println(strings.getOrNull(2))
    // Getting a maximum value in a collection.
    println(ints.max())
    // Joining a list with the zip function.
    println(colorList.zip(strings)) // prints [(black, spring), (white, summer), (green, fall)]
    // Merging a list
    val mergedList = listOf(colorList, strings)
    println(mergedList) // Prints [[black, white, green], [spring, summer, fall, winter]]
    

}
