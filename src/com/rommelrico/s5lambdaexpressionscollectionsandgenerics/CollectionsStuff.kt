package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {
    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.filter { it % 2 != 0 }) // only odd numbers

    val immutableMap = mapOf(
            1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013)
    )
    println(immutableMap.filter { it.value.year == 2015 }) // Filtering for 2015 cars

    // Filtering on a mutable map. It returns a new map. Doesn't alter the existing map.
    val mutableMap = mutableMapOf(
            1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013),
            17 to Car("red", "BMW", 2015),
            8 to Car("green", "Ford", 2010)
    )
    println(mutableMap.filter { it.value.color == "silver" })

    // Adding 10 to the mutable list.
    val ints = arrayOf(1, 2, 3, 4, 5)
    val add10List: MutableList<Int> = mutableListOf()
    for (i in ints) {
        add10List.add(i + 10)
    }
    println(add10List) // prints [11, 12, 13, 14, 15]

    // Adding 10 using a lambda (map function).
    val add10ListTwo = ints.map { it + 10 }
    println(add10ListTwo)

    // Getting a list of the years.
    println(immutableMap.map { it.value.year } ) // prints [2015, 2016, 2013]

    // Chaining filters and maps.
    // Getting all colors of Ford cars.
    println(mutableMap.filter { it.value.model == "Ford" }.map { it.value.color }) // prints [red, green]

    // Checking if all cars are newer than 2014.
    println(mutableMap.all { it.value.year > 2014 }) // prints false

    // Checking if any car is newer than 2014.
    println(mutableMap.any { it.value.year > 2014 }) // prints true
    // Checking how many cars are newer than 2014.
    println(mutableMap.count { it.value.year > 2014 }) // prints 3

    // Finding the first car that's newer than 2014
    val cars = mutableMap.values
    println(cars.find { it.year > 2014 }) // prints Car(color=green, model=Toyota, year=2015)
    // Grouping items by color
    println(cars.groupBy { it.color }) // prints sets of cars grouped by color.

}
