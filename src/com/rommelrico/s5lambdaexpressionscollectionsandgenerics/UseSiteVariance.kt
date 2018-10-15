package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {

    val cars1 = mutableListOf(Car2(), Car2())
    val cars2 = mutableListOf<Car2>()
    copyCars(cars1, cars2)

}

fun copyCars(source: MutableList<Car2>, destination: MutableList<Car2>) {
    for (car in source) {
        destination.add(car)
    }
}

open class Car2

class Toyota: Car2()

class Ford: Car2()
