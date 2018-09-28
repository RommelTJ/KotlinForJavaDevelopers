package com.rommelrico.s2datatypesandnullreferencehandling.nullreferences

fun main(args: Array<String>) {
    // val str: String = null // Can't do this. Null cannot be a value of non-null type String
    val str: String? = "This isn't null" // This is ok.
    // str.toUpperCase() // can't do this because non-safe calls are not allowed.
    println(str?.toUpperCase())
}
