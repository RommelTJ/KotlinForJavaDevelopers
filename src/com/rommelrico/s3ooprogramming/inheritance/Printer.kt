package com.rommelrico.s3ooprogramming.inheritance

// To tell compiler that this class can be extended we add 'open'
// Since we declared the class as 'abstract', we no longer need 'open' since it's redundant because abstract classes
// have to be extended.
abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer is: $modelName")

    // 'abstract' functions are open by default.
    abstract fun bestSellingPrice(): Double

}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {

    // Requires 'override' keyword and base function to be 'open'.
    final override fun printModel() = println("The model name of this laser printer is: $modelName")

    override fun bestSellingPrice(): Double = 129.99

}

class SpecialLaserPrinter(modelName: String, ppm: Int): LaserPrinter(modelName, ppm) {

    // Cannot do this because we explicitly declare it as 'final' in LaserPrinter class
    // override fun printModel() = println("This is my way of doing it.")

}

open class Something: MySubInterface {

    val someProperty: String
    override val number: Int = 25

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor.")
    }

    override fun myFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun mySubFunction(num: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class SomethingElse: Something {
    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("I'm in the child's constructor.")
    }
}

// Data Classes cannot be extended or abstract or inner. They can extend from other classes.
data class DataClass(val number: Int) { }

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Brother", 12)
    laserPrinter.printModel()

    val somethingElse = SomethingElse("Test")

}

interface MyInterface {

    val number: Int
    // val number2: Int = 50 // can't do this in Kotlin
    val number2: Int
        get() = number * 100

    fun myFunction(str: String): String

}

interface MySubInterface: MyInterface {

    fun mySubFunction(num: Int): String

}

