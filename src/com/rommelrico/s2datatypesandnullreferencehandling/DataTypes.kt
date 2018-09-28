package com.rommelrico.s2datatypesandnullreferencehandling

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


}