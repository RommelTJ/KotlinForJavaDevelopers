package com.rommelrico.s4loopsandexpressions

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main(args: Array<String>) {

    // Using try and catch as an expression in Kotlin
    println("${getNumber("5")}")
    println("${getNumber("abc") ?: throw IllegalArgumentException("Number isn't Int")}")

}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("I'm in the finally block.")
        1 // not involved in value of try-catch block so won't be returned / will be ignored
    }
}
