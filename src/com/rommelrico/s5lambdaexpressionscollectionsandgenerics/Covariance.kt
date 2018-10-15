package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {
    val shortList: List<Short> = listOf(1, 2, 3, 4, 5)
    println(convertToInt(shortList))
}

fun convertToInt(collection: List<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}
