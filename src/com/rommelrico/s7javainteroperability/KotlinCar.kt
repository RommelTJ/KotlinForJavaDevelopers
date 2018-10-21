@file:JvmName("StaticCar")
package com.rommelrico.s7javainteroperability

fun topLevel() = println("I'm in a KotlinCar file!")

fun main(args: Array<String>) {
    "Print this".print()
}

class KotlinCar(val color: String, val model: String, val year: Int)

fun String.print() {
    println(this)
}
