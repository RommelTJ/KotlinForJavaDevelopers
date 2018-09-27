package com.rommelrico.s1basicdifferences

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    println("Hello World")

    // Variable declarations in Kotlin.
    // val == Constants (final and immutable variables)
    // var == Variables (mutable variables)
    val number = 25
    val number2: Int
    val number3: Short = 25

    // number = 30 // cannot do this
    var number4 = 25
    number4 = 30 // this is ok.

    val employee1 = Employee("Rommel", 123)
    employee1.name = "Rommel2" // Can do this even if employee1 is a "val" variable.
    // employee1.id = 124 // Cannot do this
    // employee1 = Employee("Tim", 125) // Cannot do this

    val employee2: Employee
    number2 = 100
    if (number < number2) {
        employee2 = Employee("Jane", 126)
    } else {
        employee2 = Employee("Mike", 127) // This is fine because compiler guarantees single assignment.
    }

    // number4 = "dsg" // Cannot change type on the fly.

    // Using a typealias.
    val employees: EmployeeSet

    // Arrays
    val names = arrayListOf("John", "Jane", "Mary")
    println(names[1])

    // Ternary operator doesn't exist in Kotlin. Replaced with "if" statement.

    // C-style for loop doesn't exist in Kotlin.

    // Kotlin doesn't have a static keyword but it still has the static concept.

    // Kotlin doesn't have a new keyword.


    val e1 = Employee("Mary", 1)
    val e2 = Employee("John", 2)
    val e3 = Employee("John", 2)

    // '==' in Kotlin is the same as '.equals', i.e. Structural equality.
    // To check for Referential equality in Kotlin, use '==='.
    println(e1 == e2) // false
    println(e2 == e3) // true
    println(e1.equals(e2)) // false (and redundant)
    println(e2.equals(e3)) // true (and redundant)
    println(e1 === e2) // false
    println(e2 === e3) // false

    val e4 = e2
    println(e4 === e2) // true
    
    // Negations
    println(e4 !== e2) // false
    println(e4 != e2) // false
    println(e2 != e3) // false
    println(e2 !== e3) // true

    // Bit Operators are spelled out
    val x = 0x00101101
    val y = 0x10011100
    var z = x and y
    z = x xor y

    // Casting in Kotlin and checking typeOf
    val something: Any = e4
    if (something is Employee) { // smart casting
        // println("Is Employee")
        // val newEmployee = something as Employee // cast in Kotlin
        // println(newEmployee.name)

        println(something.name) // taking advantage of smart casting
    }

    // String templates
    val change = 4.22
    println("You owe me $change in \$change")
    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    println("The employee's id is ${e1.id}")

}

class Employee(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Employee

        if (name != other.name) return false
        if (id != other.id) return false

        return true
    }

    override fun toString(): String {
        return "Employee(name='$name', id=$id)" // String templates
    }

}
