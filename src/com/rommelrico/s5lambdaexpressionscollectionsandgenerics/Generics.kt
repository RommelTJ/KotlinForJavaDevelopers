package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

import java.math.BigDecimal

fun main(args: Array<String>) {

    val list: MutableList<String> = mutableListOf("Hello")
    list[0].toUpperCase()
    list.add("Another string")
    printCollection(list)

    // Using any kind of List.
    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(3503.99), BigDecimal(0.329))
    printCollection(bdList)

}

// Accepting any type of List.
fun <T> printCollection(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}