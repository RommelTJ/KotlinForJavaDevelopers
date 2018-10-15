package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

// Contravariance is opposite of Covariance. It means accepting all subclasses, vs preserving the type.
fun main(args: Array<String>) {

    val flowerTender = object: FlowerCare<Flower2> {
        override fun prune(flower: Flower2) = println("I'm tending a ${flower.name}!")
    }

    val roseTender = object: FlowerCare<Rose> {
        override fun prune(flower: Rose) = println("I'm pruning a rose!")
    }
    val roseGarden2 = Garden2<Rose2>(listOf(Rose2(), Rose2()), roseTender)
    roseGarden2.tendFlower(0)

    val daffodilTender = object: FlowerCare<Daffodil> {
        override fun prune(flower: Daffodil) = println("I'm pruning a daffodil!")
    }
    val daffodilGarden = Garden2<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()), daffodilTender)
    daffodilGarden.tendFlower(2)

}

open class Flower2(val name: String)

class Garden2<T: Flower2>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {

    fun pickFlower(i: Int) = flowers[i]

    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }

}

class Rose2: Flower2("Rose")

class Daffodil: Flower2("Daffodil")

// Making FlowerCare Contravariant by adding the in keyword.
interface FlowerCare<in T> {
    fun prune(flower: T)
}
