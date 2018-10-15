package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {

    val roseTender = object: FlowerCare<Rose> {
        override fun prune(flower: Rose) = println("I'm pruning a rose!")
    }
    val roseGarden2 = Garden2<Rose>(listOf(Rose(), Rose()), roseTender)
    roseGarden2.tendFlower(0)

}

class Garden2<T: Flower>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {

    fun pickFlower(i: Int) = flowers[i]

    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }

}

interface FlowerCare<T> {
    fun prune(flower: T)
}
