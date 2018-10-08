package com.rommelrico.s4loopsandexpressions

fun main(args: Array<String>) {

    // Part 1
//    for (num in 5..5000 step 5) {
//        println(num)
//    }

    // Part 2
//    for (num in -500..0) {
//        println(num)
//    }

    // Part 3
    // Print the first 15 numbers in the Fibonacci sequence using a range.
//    println(0)
//    println(1)
//    var total: Int
//    var secondToLast = 0
//    var last = 1
//    for (i in 1..13) {
//        total = secondToLast + last
//        println(total)
//        secondToLast = last
//        last = total
//    }

    // Part 4
    firstLoop@ for (i in 1..5) {
        if (i == 1) {
            println(i)
            continue
        }
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    if (i == 2) {
                        println(i)
                    }
                    break@firstLoop
                }
            }
        }
    }

    // Part 5
    val num: Int = 3
    val dNum: Double = when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else -> 0.0
    }
    println(dNum)


}