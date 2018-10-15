package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

class Person(val firstName: String, val lastName: String, val age: Int)

fun main(args: Array<String>) {
    val joe = Person("Joe", "Jones", 45)
//    val (fName, lName, age) = joe
//    println("fName = $fName, lName = $lName, age = $age")
}
