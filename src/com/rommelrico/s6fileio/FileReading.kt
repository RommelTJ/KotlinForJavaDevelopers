package com.rommelrico.s6fileio

import java.io.File

fun main(args: Array<String>) {

    val lines = File("testfile.txt").reader().readLines()
    lines.forEach { println(it) }

    val reader = File("testfile.txt").reader()
    val lines2 = reader.readText() // This needs to be closed.
    println(lines2)
    reader.close() // closing the resource.

    // More concise. Use function will close the reader.
    val lines3 = File("testfile.txt").bufferedReader().use { it.readText() }
    println(lines3)

}