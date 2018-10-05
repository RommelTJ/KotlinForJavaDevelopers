package com.rommelrico.s3ooprogramming.challenge3

open class KotlinBicycle(var cadence: Int, var gear: Int, var speed: Int) {

    fun applyBreak(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment;
    }

    fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence traveling at a speed of $speed.")
    }

}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, gear: Int, speed: Int): KotlinBicycle(cadence, gear, speed)

class KotlinRoadBike(val tireWidth: Int, cadence: Int, gear: Int, speed: Int): KotlinBicycle(cadence, gear, speed)

