@file:JvmName("StaticCar")
package com.rommelrico.s7javainteroperability

fun topLevel() = println("I'm in a KotlinCar file!")

fun main(args: Array<String>) {
    "Print this".print()
}

class KotlinCar(val color: String, @JvmField val model: String, val year: Int) {

//    var color: String = color
//    set(value) {
//        field = "always green"
//    }

    companion object {
        @JvmStatic fun carComp() = println("I'm in KotlinCar's companion object!")
    }

}

fun String.print() {
    println(this)
}
