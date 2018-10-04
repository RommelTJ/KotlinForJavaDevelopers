package com.rommelrico.s3ooprogramming

import java.time.Year

// 'object' keyword means only one instance will be created.
// Kotlin 'object' declaration declares and creates an instance at the same time.
object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"

    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."

}

fun main(args: Array<String>) {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    println(SomeClass.accessPrivateVar())
}

// There's no 'static' keyword in Kotlin so you have to create Companion objects.
class SomeClass {

    // Everything within 'companion' is kind of like 'static' in Java.
    companion object {
        private var privateVar = 6

        fun accessPrivateVar() = "I'm accessing $privateVar"

    }

}
