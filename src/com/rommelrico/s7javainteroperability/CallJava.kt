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

}
