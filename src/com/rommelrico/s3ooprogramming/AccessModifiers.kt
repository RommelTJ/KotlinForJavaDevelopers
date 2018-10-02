package com.rommelrico.s3ooprogramming

val MY_CONSTANT = 100

fun main(args: Array<String>) {

    println(MY_CONSTANT)

    // Top level items are public by default in Kotlin (vs package-private)
    // In Kotlin, private top-level items mean everything in same file can access
    // In Kotlin, no matching requirement between Class names and filenames.

    val m = Employee("John")
    println(m.firstName)
    println(m.fullTime) // under the covers this is calling a getter/setter.
    m.fullTime = false
    println(m.fullTime)

    var n = Employee("Jane", false)
    println(n.firstName)
    println(n.fullTime)

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
// class Employee(val firstName: String, val fullTime: Boolean = true)
// Kotlin is creating default setters/getters for us.
// In Kotlin, if you declare a variable as private, there is no way to access it from the outside. This is different
// than how Java does it.
// In Kotlin, getters/setters have to have same or less permissive accessor than the property it's modifying.
// There's no point in setting a property private to prevent it from being directly modified, so it's not necessary.

// This is how you create a more advanced getter/setter.
class Employee(val firstName: String, fullTime: Boolean = true) {
    var fullTime = fullTime

    // Using a backing field to refer to a custom getter/setter. Backing field gets generated only if needed.
    get() {
        println("Running custom get.")
        return field // This is a backing field.
    }

    set(value) {
        println("Running custom set")
        field = value
    }

}