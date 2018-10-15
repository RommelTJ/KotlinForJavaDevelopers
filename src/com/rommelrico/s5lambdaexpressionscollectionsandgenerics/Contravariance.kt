package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

// Contravariance is opposite of Covariance. It means accepting all subclasses, vs preserving the type.
fun main(args: Array<String>) {

    val flowerTender = object: FlowerCare<Flower2> {
        override fun prune(flower: Flower2) = println("I'm tending a ${flower.name}!")
    }

    val roseGarden2 = Garden2(listOf(Rose2(), Rose2()), flowerTender)
    roseGarden2.tendFlower(0)

    val daffodilGarden = Garden2(listOf(Daffodil(), Daffodil(), Daffodil()), flowerTender)
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
// Making an object contravariant means you can now only write a parameter, not read it. If you didn't have this
// restriction, you would be able to treat a superclass like its subclass and that's not always the case (e.g., a
// Daffodil is always a Flower, but a Flower is not always a Daffodil).
interface FlowerCare<in T> {
    fun prune(flower: T)
}
