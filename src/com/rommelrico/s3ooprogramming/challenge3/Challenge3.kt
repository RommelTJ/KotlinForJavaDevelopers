package com.rommelrico.s3ooprogramming.challenge3

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

