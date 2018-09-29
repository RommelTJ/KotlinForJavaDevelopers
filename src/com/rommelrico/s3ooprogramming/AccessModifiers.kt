package com.rommelrico.s3ooprogramming

fun main(args: Array<String>) {
    // Top level items are public by default in Kotlin (vs package-private)
    // In Kotlin, private top-level items mean everything in same file can access
    // In Kotlin, no matching requirement between Class names and filenames.

    val m = Employee()
    println(m)
}

private class Employee