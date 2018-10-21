@file:JvmName("StaticCar")
package com.rommelrico.s7javainteroperability

fun topLevel() = println("I'm in a KotlinCar file!")

class KotlinCar(val color: String, val mode: String, val year: Int)
