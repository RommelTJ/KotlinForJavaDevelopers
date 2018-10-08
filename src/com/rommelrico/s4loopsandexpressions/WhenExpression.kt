package com.rommelrico.s4loopsandexpressions

fun main(args: Array<String>) {

    // Equivalent 'when' expression to SwitchExample.java
    val num = 600
    when (num) {
        100, 600 -> println("600")
        200 -> println("200")
        300 -> println("300")
        else -> println("Doesn't match anything.")
    }

}
