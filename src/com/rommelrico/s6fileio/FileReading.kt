package com.rommelrico.s6fileio

import java.io.File

fun main(args: Array<String>) {

    val lines = File("testfile.txt").reader().readLines()
    println(lines)

}
