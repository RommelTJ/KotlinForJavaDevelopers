package s1_basicdifferences

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

}

class Employee(var name: String, val id: Int) {

}
