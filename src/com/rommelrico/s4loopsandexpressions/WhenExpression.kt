package com.rommelrico.s4loopsandexpressions

import java.math.BigDecimal

fun main(args: Array<String>) {

    // Equivalent 'when' expression to SwitchExample.java
    val num = 100
    when (num) {
        in 100..199 -> println("In range 100..199")
        200, 400 -> println("200")
        300 -> println("300")
        else -> println("Doesn't match anything.")
    }

    // Using expressions
    val y = 10
    when (num) {
        y + 80 -> println("90")
        y + 90 -> println("100")
        300 -> println("300")
        else -> println("Doesn't match anything.")
    }

    val obj: Any = "I'm a string"
    val obj2: Any = BigDecimal(25.2)
    val obj3: Any = 45
    val something: Any = obj2
    if (something is String) {
        println(something.toUpperCase())
    } else if (something is BigDecimal) {
        println(something.remainder(BigDecimal(10.5)))
    } else if (something is Int) {
        println("${something - 22}")
    }

}
