package com.rommelrico.s2datatypesandnullreferencehandling

import com.rommelrico.s2datatypesandnullreferencehandling.javacode.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {
    val myInt = 10
    var myLong = 22L
    // val myLong: Long = 22

    // Kotlin does not automatically widen numbers
    // myLong = myInt // can't do this
    myLong = myInt.toLong() // this is ok

    val myByte: Byte = 111
    var myShort: Short
    // myShort = myByte // can't do this
    myShort = myByte.toShort() // this is ok

    // Kotlin will automatically widen literals
    val anotherInt = 5

    var myDouble = 65.984
    println(myDouble is Double)

    val myFloat = 838.8492f
    println(myFloat is Float)

    // myDouble = myFloat // can't do this
    myDouble = myFloat.toDouble() // this is ok

    val char = 'b'
    val char2: Char = 65.toChar();
    println(char2) // prints 'A'

    val myBoolean: Boolean = true

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

    val anything: Any
    // Unit is the same as void in Java
    // Nothing class is a subclass of every class.
    // Nothing is used when you know a function will never return.

    // Arrays

    // 1 way is if you know the type in advance
    val names = arrayOf("John", "Jane", "Joe")
    // Another way is if you specify type
    val longs: Array<Long> = arrayOf(1, 2, 3)
    val longs2 = arrayOf(1L, 2L, 3L)
    val longs4 = arrayOf<Long>(1, 2, 3)

    println(longs[2]) // prints 3

    // Lambda expression in initializer
    val evenNumbers = Array(16) { i -> i * 2 }
    for (number in evenNumbers) {
        println(number)
    }

    val lotsOfNumbers = Array(100000) { i -> i + 1 }
    val allZeroes = Array(100) { i -> 0 }
    val allZeroes2 = Array(100) { 0 }

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    for (number in someArray) {
        println(number)
    }

    someArray = Array(6) { i -> (i+1) * 10 }
    for (number in someArray) {
        println(number)
    }

    // You can mix datatypes in an array
    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for (element in mixedArray) {
        println(element)
    }

    val myIntArray = arrayOf(1, 2, 3)
    val myIntArray2 = intArrayOf(1, 2, 3)
    // DummyClass().printNumbers(myIntArray) // can't do this
    DummyClass().printNumbers(myIntArray2)

    // this is ok because it's a primitive type and they're initialized to default values.
    var someOtherArray = IntArray(5)

    // Converting Kotlin Array to Primitive type array
    DummyClass().printNumbers(evenNumbers.toIntArray())

    // To convert primitive type array to Kotlin Array
    val convertedIntArray: Array<Int> = myIntArray2.toTypedArray()

}