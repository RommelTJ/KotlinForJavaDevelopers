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
    println(immutableMap.filter { it.value.model == "Ford" }.map { it.value.color })

}