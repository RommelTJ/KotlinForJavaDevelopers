package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {
    val immutableMap = mapOf(
            1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013),
            17 to Car("red", "BMW", 2015),
            8 to Car("green", "Ford", 2010)
    )

    // Working with collections
    println(immutableMap.filter { it.value.model == "Ford" }.map { it.value.color }) // prints [red, green]

    // Sequences are the same as Streams in Java. Java Streams are not available in every platform.
    // Avoiding creation of intermediate collections with sequences. Also useful when you don't know how much data
    // will be returned. Kotlin collections are very efficient, though.
    println(immutableMap.asSequence().filter { it.value.model == "Ford" }.map { it.value.color }) // prints kotlin.sequences.TransformingSequence@3af49f1c

    // Transforming items in a sequence. None of the print statements run because these are intermediate operations, not terminal operations.
    listOf("Joe", "Mary", "Jane").asSequence().filter { println("filtering $it"); it[0] == 'J' }.map { println("mapping $it"); it.toUpperCase() }

}