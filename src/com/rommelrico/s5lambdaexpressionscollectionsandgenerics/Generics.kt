package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

import java.math.BigDecimal

fun main(args: Array<String>) {

    val list: MutableList<String> = mutableListOf("Hello")
    list[0].toUpperCase()
    list.add("Another string")
    printCollection(list)

    // Not able to print a non generic list.
    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(3503.99), BigDecimal(0.329))
    printCollection(bdList)

}

fun printCollection(collection: List<String>) {
    for (item in collection) {
        println(item)
    }
}