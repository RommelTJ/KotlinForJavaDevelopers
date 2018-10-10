package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {
    // Immutable List<String>. Immutable in Kotlin, but not in Java.
    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass) // class java.util.Arrays$ArrayList

    val emptyList = emptyList<String>()
    println(emptyList.javaClass) // class kotlin.collections.EmptyList

    // List of not null
    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList) // prints hello and goodbye
}