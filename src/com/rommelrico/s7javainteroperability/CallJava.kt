package com.rommelrico.s7javainteroperability

import com.rommelrico.s7javainteroperability.javacode.Car

fun main(args: Array<String>) {

    val car = Car("blue", "Ford", 2015)
    car.color = "green"
    println(car)

    var model = car.model
    println(model)
    model = null
    println(model)

    var model2: String? = car.model
    println(car)
    println(model2)

    car.variableMethod(5, "hello", "goodbye")
    val strings = arrayOf("hello", "goodbye")
    // car.variableMethod(10, strings) // This doesn't work
    car.variableMethod(10, *strings) // Works with the spread operator.

    // car.wantsIntArray(arrayOf(1, 2, 3)) // Doesn't work because Array<Int> != IntArray.
    car.wantsIntArray(arrayOf(1, 2, 3).toIntArray()) // this works.
    car.wantsIntArray(intArrayOf(4, 5, 6)) // this also works.

    // (car.anObject as java.lang.Object).notify() // Using the Java Object class
    // car.anObject.javaClass // equivalent.

    // Working with static members in Kotlin.
    println("x = ${Car.x}")
    println(Car.xString())
    println(Car.xString())

}
