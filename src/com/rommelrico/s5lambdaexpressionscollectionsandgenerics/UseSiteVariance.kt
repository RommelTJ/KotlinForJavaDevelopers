package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {

    val cars1 = mutableListOf(Car2(), Car2())
    val cars2 = mutableListOf<Car2>()
    copyCars(cars1, cars2)

    // Can't do this because Fords != Car2.
//    val fords1 = mutableListOf(Ford(), Ford())
//    val fords2 = mutableListOf<Ford>()
//    copyCars(fords1, fords2) // Type Mismatch

    val fords1 = mutableListOf(Ford(), Ford())
    val fords2 = mutableListOf<Ford>()
    copyCars(fords1, fords2)
    // copyCars(fords1, cars2) // Type inference failed.

    // This is ok because Car is a supertype.
    val cars3: MutableList<Car2> = mutableListOf(Ford(), Ford())
    copyCars(fords1, cars2)
    println(cars2)

}

// Sample Use-site variance. Source is not written, only read. Destination is not read, only written.
fun <T: Car2> copyCars(source: MutableList<out T>, destination: MutableList<in T>) {
    for (car in source) {
        destination.add(car)
    }
}

open class Car2

class Toyota: Car2()

class Ford: Car2()
