package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {

    val ints = listOf(1, 2, 3, 4, 5)
    val shorts: List<Short> = listOf(10, 20, 30, 40)
    val floats: List<Float> = listOf(100.3f, -459.43f)

    convertToInt(ints)
    convertToInt(shorts)
    convertToInt(floats)

}

fun <T: Number> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}
