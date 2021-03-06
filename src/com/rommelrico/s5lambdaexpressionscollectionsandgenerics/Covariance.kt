package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

import java.math.BigDecimal

fun main(args: Array<String>) {
    val shortList: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5)
    println(convertToInt(shortList)) // prints only 1, 2, 3, 4, 5, and not BigDecimal(243.356235).
}

fun convertToInt(collection: MutableList<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
    collection.add(BigDecimal(243.356235))
}

fun tendGarden(roseGarden: Garden<Rose>) {
    // waterGarden(roseGarden) // can't do this because Garden is invariant.
    waterGarden(roseGarden) // This is now ok.
}

fun waterGarden(garden: Garden<Flower>) {  }

open class Flower

class Rose: Flower()

// This class is invariant.
// You make a variable covariant by adding the 'out' keyword.
// You can only use it in the out position. You can't have a var of type T now,
// but val is ok because it can't be modified.
class Garden<out T: Flower>(val something: T) {
    val flowers: List<T> = listOf()
    fun pickFlower(i: Int): T = flowers[i]

    // Cannot do this because T is now an out-position.
    // fun plantFlower(flower: T) {}

}
