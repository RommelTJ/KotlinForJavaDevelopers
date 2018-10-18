package com.rommelrico.s6fileio

import java.io.DataInputStream
import java.io.EOFException
import java.io.FileInputStream

// Reading from Binary Files is just using the Java IO behind the scenes.
fun main(args: Array<String>) {

    val di = DataInputStream(FileInputStream("testfile.bin"))
    var si: String

    try {
        while (true) {
            si = di.readUTF()
            println(si)
        }
    } catch (e: EOFException) {
        println("EOFException: " + e.message)
    }

}
