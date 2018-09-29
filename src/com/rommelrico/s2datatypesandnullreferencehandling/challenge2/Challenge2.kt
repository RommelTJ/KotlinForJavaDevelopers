package com.rommelrico.s2datatypesandnullreferencehandling.challenge2

fun main(args: Array<String>) {
    // Part 1
    // val float1 = -3847.384F
    // val float2: Float = -3847.384.toFloat()

    // Part 2
    val float1: Float? = -3847.384F
    val float2: Float? = -3847.384.toFloat()

    // Part 3
    val shortArray = arrayOf<Short>(1, 2, 3, 4, 5)

    // Part 4
    val nullableIntArray = Array<Int?>(40) { i -> (i + 1) * 5 }

    // Part 5
    val charArray = charArrayOf('a', 'b', 'c')

    // Part 6
    val x: String? = "I AM IN UPPERCASE"
    val y = x?.toLowerCase() ?: "I give up!"

    // Part 7
    x?.let { println(it.toLowerCase().replace("am", "am not")) }

    // Part 8
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()

}