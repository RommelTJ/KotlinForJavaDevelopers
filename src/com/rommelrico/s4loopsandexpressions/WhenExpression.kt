package com.rommelrico.s4loopsandexpressions

fun main(args: Array<String>) {

    // Equivalent 'when' expression to SwitchExample.java
    val num = 150
    when (num) {
        in 100..199 -> println("In range 100..199")
        200, 400 -> println("200")
        300 -> println("300")
        else -> println("Doesn't match anything.")
    }

}
