package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

import java.math.BigDecimal

fun main(args: Array<String>) {

    val mixedList: List<Any> = listOf("string", 1, BigDecimal(22.5), "fall", BigDecimal(-5938.398))
    val bigDecimalsOnly = getElementsOfType<BigDecimal>(mixedList)
    println(bigDecimalsOnly)

}

// Reified function.
inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {

    var newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) {
            newList.add(element)
        }
    }

    return newList
}
