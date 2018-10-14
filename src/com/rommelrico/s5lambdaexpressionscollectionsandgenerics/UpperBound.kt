package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {

    val ints = listOf(1, 2, 3, 4, 5)
    val shorts: List<Short> = listOf(10, 20, 30, 40)

}

fun <T: Number> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}
