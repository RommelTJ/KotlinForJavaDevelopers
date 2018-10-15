package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

// Contravariance is opposite of Covariance. It means accepting all subclasses, vs preserving the type.
fun main(args: Array<String>) {

    val flowerTender = object: FlowerCare<Flower> {
        override fun prune(flower: Flower) = println("I'm tending a flower!")
    }

    val roseTender = object: FlowerCare<Rose> {
        override fun prune(flower: Rose) = println("I'm pruning a rose!")
    }
    val roseGarden2 = Garden2<Rose>(listOf(Rose(), Rose()), roseTender)
    roseGarden2.tendFlower(0)

    val daffodilTender = object: FlowerCare<Daffodil> {
        override fun prune(flower: Daffodil) = println("I'm pruning a daffodil!")
    }
    val daffodilGarden = Garden2<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()), daffodilTender)
    daffodilGarden.tendFlower(2)

}

class Garden2<T: Flower>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {

    fun pickFlower(i: Int) = flowers[i]

    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }

}

class Daffodil: Flower()

interface FlowerCare<T> {
    fun prune(flower: T)
}
