package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

import java.lang.Appendable
import java.lang.StringBuilder

fun main(args: Array<String>) {

    val ints = listOf(1, 2, 3, 4, 5)
    val shorts: List<Short?> = listOf(10, 20, 30, 40)
    val floats: List<Float?> = listOf(100.3f, -459.43f)
    val strings = listOf("1", "2", "3")

    convertToInt(ints)
    convertToInt(shorts)
    convertToInt(floats)

    append(StringBuilder("String 1"), StringBuilder("String 2"))

    printCollection(shorts)
    printCollection(strings)

    if (strings is List<String>) {
        println("This list contains Strings")
    }

}

fun <T: Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num?.toInt()}")
    }
}

fun <T> append(item1: T, item2: T) where T: CharSequence, T: Appendable {
    println("Result is ${item1.append(item2)}")
}

fun <T: Any> printCollection(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}
