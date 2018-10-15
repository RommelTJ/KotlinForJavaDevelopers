package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {

}

fun copyCars(source: MutableList<Car2>, destination: MutableList<Car2>) {
    for (car in source) {
        destination.add(car)
    }
}

open class Car2

class Toyota: Car2()

class Ford: Car2()
