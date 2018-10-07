package com.rommelrico.s4loopsandexpressions

// if statement in Kotlin can be an expression that returns a value.
fun main(args: Array<String>) {

    val someCondition = 69 < 22
//    var num: Int
//    if (someCondition) {
//        num = 50
//    } else {
//        num = 592
//    }
    val num = if (someCondition) 50 else 592
    println(num)

    val num2 = if (someCondition) {
        50
    } else {
        593
    }
    println(num2)

    // You can use if statements however you would use an expression
    println(if (someCondition) {
        50
    } else {
        594
    })

    // You can also assign Unit if you don't assign anything.
    val x = if(someCondition) {
        println("Something")
    } else {
        println("Something else")
    }
    println(x)

}