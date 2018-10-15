package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {
    val shortList: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5)
    println(convertToInt(shortList))
}

fun convertToInt(collection: MutableList<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden) // can't do this because Garden is invariant.
}

fun waterGarden(garden: Garden<Flower>) {  }

open class Flower

class Rose: Flower()

// This class is invariant.
class Garden<T: Flower>
