package com.rommelrico.s3ooprogramming

import java.time.Year

// 'object' keyword means only one instance will be created.
// Kotlin 'object' declaration declares and creates an instance at the same time.
object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"

    internal fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."

}

fun main(args: Array<String>) {
    topLevel("I'm private")

    println(Department.ACCOUNTING.getDepartmentInfo())
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    println(SomeClass.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("This is the string as-is")
    val someClass2 = SomeClass.upperOrLowerCase("This isn't the string as-is", false)
    println(someClass1.someString)
    println(someClass2.someString)

    var thisIsMutable = 45

    wantSomeInterface(object: SomeInterface {
        override fun mustImplement(num: Int): String {
            thisIsMutable++
            return "This is from must implement ${num * 100}"
        }
    })

    println("$thisIsMutable")
}

// There's no 'static' keyword in Kotlin so you have to create Companion objects.
class SomeClass private constructor (val someString: String) {

    // Everything within 'companion' is kind of like 'static' in Java.
    companion object {
        private var privateVar = 6

        fun accessPrivateVar() = "I'm accessing $privateVar"

        fun justAssign(str: String) = SomeClass(str)

        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if (lowerCase) {
                return SomeClass(str.toLowerCase())
            } else {
                return SomeClass(str.toUpperCase())
            }
        }

    }

}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantSomeInterface(si: SomeInterface) {
    println("Printing from wantSomeInterface ${si.mustImplement(22)}")
}

// Enums in Kotlin
enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5),
    IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3),
    SALES("Sales", 20); // Semicolon required if you add a function.

    fun getDepartmentInfo() = "The $fullName department has $numEmployees employees"

}

fun topLevel(str: String) = println("Top level function: $str")
