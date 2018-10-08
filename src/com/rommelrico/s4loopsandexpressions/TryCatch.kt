package com.rommelrico.s4loopsandexpressions

import java.lang.NumberFormatException

fun main(args: Array<String>) {

    // Using try and catch as an expression in Kotlin
    println("${getNumber("5")}")
    println("${getNumber("abc")}")

}

fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        0
    } finally {
        println("I'm in the finally block.")
    }
}
