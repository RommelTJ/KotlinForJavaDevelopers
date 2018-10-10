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

    // This is a mutable list, but has no methods to modify it.
    val arrayList = arrayListOf(1, 2, 3)
    println(arrayList.javaClass) // prints class java.util.ArrayList

    // This is a mutable list.
    val mutableList = mutableListOf(1, 2, 3)
    println(mutableList.javaClass) // prints class java.util.ArrayList

    // Generating a list from an array.
    val array = arrayOf("black", "white", "green")
    val colorList = listOf(array)
    val colorList2 = listOf(*array)
    val colorList3 = array.toList()
    println(colorList.javaClass) // prints class java.util.Collections$SingletonList
    println(colorList2.javaClass) // prints class java.util.Arrays$ArrayList
    println(colorList3.javaClass) // prints class java.util.ArrayList

}