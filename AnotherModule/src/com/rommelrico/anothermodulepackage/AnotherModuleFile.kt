package com.rommelrico.anothermodulepackage

import com.rommelrico.s3ooprogramming.CompanyCommunications
import com.rommelrico.s3ooprogramming.topLevel
import com.rommelrico.s3ooprogramming.upperFirstAndLast as ufal

fun main(args: Array<String>) {
    topLevel("Test2")
    println("A string to work with".ufal())
    // CompanyCommunications.getCopyrightLine() // Can't do this because it's internal
}
