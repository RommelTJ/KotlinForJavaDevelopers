package com.rommelrico.s3ooprogramming.inheritance

// To tell compiler that this class can be extended we add 'open'
// Since we declared the class as 'abstract', we no longer need 'open' since it's redundant because abstract classes
// have to be extended.
abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer is: $modelName")
}

class LaserPrinter(modelName: String): Printer(modelName) {
    // Requires 'override' keyword and base function to be 'open'.
    override fun printModel() = println("The model name of this laser printer is: $modelName")
}

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Brother")
    laserPrinter.printModel()
}