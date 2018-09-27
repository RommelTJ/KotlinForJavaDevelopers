package com.rommelrico.challenge1

fun main(args: Array<String>) {
    val hello1 = "Hello"
    val hello2 = "Hello"

    println(hello1 === hello2)

    println(hello1 == hello2)

    var x = 2988

    val y: Any = "The Any type is the root of the Kotlin class hierarchy."
    if (y is String) {
        println(y.toUpperCase())
    }

    println("""
        *    1
        *   11
        *  111
        * 1111
        """.trimMargin("*"))
}