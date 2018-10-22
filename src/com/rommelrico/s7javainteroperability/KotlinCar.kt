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
        const val constant = 25
        @JvmField val isAuto = false
        @JvmStatic fun carComp() = println("I'm in KotlinCar's companion object!")
    }

    fun printMe(text: String) {
        println("I don't expect a null value: $text")
    }

}

fun String.print() {
    println(this)
}

object SingletonObj {
    @JvmStatic fun doSomething() = println("I'm doing something in the Singleton object.")
}
