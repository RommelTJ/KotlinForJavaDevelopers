package com.rommelrico.s3ooprogramming

fun main(args: Array<String>): Unit {
    println(labelMultiply(5, 4, "The result is: "))
    val e1 = Employee2("John")
    println(e1.upperCaseFirstName())
    println(labelMultiply(5, 4))
    println(labelMultiply(label = "Here's the result: ", operand2 = 2, operand1 = 4))

    var car1 = Car("Blue", "Subaru", 2018)
    var car2 = Car("Red", "Ford", 2017)
    var car3 = Car("Green", "Honda", 2016)

    printColors(car1, car2, car3)

    val manyCars = arrayOf(car1, car2, car3)
    printColors(*manyCars)

}

// Can only use one vararg per function, and should typically be listed at the end.
fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}

/*
fun labelMultiply(operand1: Int, operand2: Int, label: String): String {
    return ("$label ${operand1 * operand2}")
}
*/

// Shorter way
fun labelMultiply(operand1: Int, operand2: Int, label: String = "The answer is: "): String = "$label ${operand1 * operand2}"

class Employee2(val firstName: String) {
    fun upperCaseFirstName() = firstName.toUpperCase()
}
