package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

import java.math.BigDecimal

fun main(args: Array<String>) {

    val list: MutableList<String> = mutableListOf("Hello")
    list[0].toUpperCase()
    list.add("Another string")
    printCollection(list)
    list.printCollection2()

    // Using any kind of List.
    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(3503.99), BigDecimal(0.329))
    printCollection(bdList)
    bdList.printCollection2()

}

// Accepting any type of List.
fun <T> printCollection(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}

// We could've also fixed this with an extension function.
fun <T> List<T>.printCollection2() {
    for (item in this) {
        println(item)
    }
}