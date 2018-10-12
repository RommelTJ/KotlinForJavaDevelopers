package com.rommelrico.s5lambdaexpressionscollectionsandgenerics

fun main(args: Array<String>) {

    val list: MutableList<String> = mutableListOf("Hello")
    list[0].toUpperCase()
    list.add("Another string")
    printCollection(list)

}

fun printCollection(collection: List<String>) {
    for (item in collection) {
        println(item)
    }
}