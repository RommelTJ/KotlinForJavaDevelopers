package com.rommelrico.s6fileio

import java.io.File

fun main(args: Array<String>) {

    // Walking a File Tree using Kotlin.
    File(".").walkTopDown()
            .filter { it.name.endsWith(".kt") }
            .forEach { println(it) }

}
