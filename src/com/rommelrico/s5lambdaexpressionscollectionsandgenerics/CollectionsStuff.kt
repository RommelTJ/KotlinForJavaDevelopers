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
            3 to Car("silver", "Honda", 2013)
    )
    println(mutableMap.filter { it.value.color == "silver" })

    // Adding 10 to the mutable list.
    val ints = arrayOf(1, 2, 3, 4, 5)
    val add10List: MutableList<Int> = mutableListOf()
    for (i in ints) {
        add10List.add(i + 10)
    }
    println(add10List) // prints [11, 12, 13, 14, 15]

}
