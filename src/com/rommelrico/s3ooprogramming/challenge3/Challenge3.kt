package com.rommelrico.s3ooprogramming.challenge3

open class KotlinBicycle(var cadence: Int, var gear: Int, var speed: Int) {

    fun applyBreak(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment;
    }

}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, gear: Int, speed: Int): KotlinBicycle(cadence, gear, speed)

class KotlinRoadBike(val tireWidth: Int, cadence: Int, gear: Int, speed: Int): KotlinBicycle(cadence, gear, speed)

