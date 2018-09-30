package com.rommelrico.s3ooprogramming

fun main(args: Array<String>) {
    // Top level items are public by default in Kotlin (vs package-private)
    // In Kotlin, private top-level items mean everything in same file can access
    // In Kotlin, no matching requirement between Class names and filenames.

    val m = Employee("John")
    println(m.firstName)

    // Module is a group of files that are compiled together; Maven or Gradle.
    // Internal is visible inside the module.

    // Top-level access modifiers: private, protected, public, and internal.
    // Public = Visible everywhere
    // Private = Visible within the same file.
    // Protected = Can't be used.
    // Internal = Visible within the same modules.

    // In Kotlin, classes can't see private members belonging to inner classes
}

/*
// Kotlin has the concept of primary constructor, and it is declared before the curly braces.
class Employee constructor(firstName: String) {

    val firstName: String

    // Init blocks are not a constructor. It's just something that runs alongside the primary constructor.
    init {
        this.firstName = firstName
    }

}
*/

/*
// Shorter way
class Employee constructor(firstName: String) {

    val firstName: String = firstName

}
*/

// Third shortest way
class Employee(val firstName: String)

