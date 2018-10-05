package com.rommelrico.s3ooprogramming.challenge3

fun main(args: Array<String>) {
    val b1 = KotlinBicycle(60, 5, 15)
    b1.printDescription()
    val b2 = KotlinMountainBike(20, 55, 20, 20)
    b2.printDescription()
    val b3 = KotlinRoadBike(22, 90, 12, 30)
    b3.printDescription()
}

open class KotlinBicycle(var cadence: Int, var gear: Int, var speed: Int) {

    fun applyBreak(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment;
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence traveling at a speed of $speed.")
    }

}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, gear: Int, speed: Int): KotlinBicycle(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }

}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, gear: Int, speed: Int): KotlinBicycle(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of " + tireWidth + "mm.")
    }

}

