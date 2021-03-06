package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "summer", "winter")
    val colorList = listOf("black", "white", "green", "black", "red")
    val ints = listOf(1, 2, 4, 6, 9, 3)
    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("Some Other Season")

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
    // Combining two lists
    val combinedList = colorList + strings
    println(combinedList) // prints [black, white, green, spring, summer, fall, winter]
    // removing duplicates.
    val noDupesList = colorList.union(strings)
    println(noDupesList) // prints [black, white, green, red, spring, summer, fall, winter]
    // Removing duplicates in a single list
    val noDupesColors = colorList.distinct()
    println(noDupesColors)

}
