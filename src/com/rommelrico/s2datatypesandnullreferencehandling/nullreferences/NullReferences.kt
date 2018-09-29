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

    // We can rewrite our imaginary example as follows to get a default:
    // val countryCode: String = bankBranch?.address?.country?.countryCode ?: "US"

    // 'as?' shorthand for smart-casting in Kotlin
    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String
    println(str3) // null, instead of ClassCastException
    println(str3?.toUpperCase()) // null, instead of ClassCastException

    // Non-null assertion.
    //println(str!!.toUpperCase()) // Throws: Exception in thread "main" kotlin.KotlinNullPointerException

    // val str4 = str!! // Throws: Exception in thread "main" kotlin.KotlinNullPointerException
    // val str5 = str4.toUpperCase() // This doesn't even run in Kotlin.
    // Not a good idea to string non-null assertion operators because they will blow up on you and you won't know
    // which variable caused the issue.

    // 'let' operator in Kotlin
    val str6: String? = "This isn't null"
    // printText(str6) // Can't do this.
    printText(str6!!) // This is ok, but unsafe.
    // Better to use the 'let' function. Short-hand for 'if (str6 != null) { printText(str6) }`
    str6?.let { printText(it) }

    // In Kotlin, equals operator is a safe operator, so the below is safe.
    val str7: String? = null
    val anotherString = "This isn't nullable."
    println(str7 == anotherString) // Structural equality. Prints 'false'.


    // Arrays and Null References
    val nullableInts = arrayOfNulls<Int?>(5)
    for (i in nullableInts) {
        println(i)
    }
    // nullableInts[3] // Most methods will be unavailable since Nulls can't be used safely.

}

fun printText(text: String) {
    println(text)
}
