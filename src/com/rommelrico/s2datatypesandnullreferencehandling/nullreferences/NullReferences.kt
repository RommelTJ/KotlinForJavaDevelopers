package com.rommelrico.s2datatypesandnullreferencehandling.nullreferences

fun main(args: Array<String>) {
    // val str: String = null // Can't do this. Null cannot be a value of non-null type String
    var str: String? = "This isn't null" // This is ok.
    // str.toUpperCase() // can't do this because non-safe calls are not allowed.
    // Safe-call operator = '?', is short-hand for 'if (str != null) { }'
    println(str?.toUpperCase())
    // Even if str is null, we don't get NullPointerException. If null, evaluate to null instead of blowing up.
    // In other words, 'if (str == null) { null }`.

    // If one of the items in the chain is null, it short-circuits to null. See verbose example in NullReferences.java.
    // val countryCode: String? = bankBranch?.address?.country?.countryCode

    // Elvis Operator '?:' is used to assign a default instead of a null.
    str = null
    val str2 = str?: "This is default value"
    println(str)
    println(str2)
}
