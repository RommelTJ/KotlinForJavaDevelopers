package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {
    // Immutable List<String>. Immutable in Kotlin, but not in Java.
    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass)
    
}