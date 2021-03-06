package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

// Challenge 1
data class Person(val firstName: String, val lastName: String, val age: Int)

fun main(args: Array<String>) {
    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age = $age")

    // Challenge 2
    val immutableMap = mapOf(
            "Jones" to joe,
            "Smith" to jane,
            "Wilson" to mary,
            "Adams" to john,
            "Smithson" to jean
    )

    // Challenge 3
    println(immutableMap.filter { it.value.lastName.startsWith('S') }.count())

    // Challenge 4
    val namePairs = immutableMap.map { Pair(it.value.firstName, it.value.lastName) }
    println(namePairs)

    // Challenge 5
    immutableMap.also { it.map { println("${it.value.firstName} is ${it.value.age}") } }

    // Challenge 6
    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 22, 101, 15)
    val list3 = list1.intersect(list2)
    println(list3)

    // Challenge 7 - Covariance.
    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper

}

class Box<out T>

open class Paper

class Regular: Paper()

class Premium: Paper()
