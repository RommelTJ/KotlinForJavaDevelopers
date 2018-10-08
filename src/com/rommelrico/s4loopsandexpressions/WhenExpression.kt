package com.rommelrico.s4loopsandexpressions

fun main(args: Array<String>) {

    // Equivalent 'when' expression to SwitchExample.java
    val num = 200
    when (num) {
        100 -> println("100")
        200 -> println("200")
        300 -> println("300")
        else -> println("Doesn't match anything.")
    }

}
