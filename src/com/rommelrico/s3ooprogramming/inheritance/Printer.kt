package com.rommelrico.s3ooprogramming.inheritance

// To tell compiler that this class can be extended we add 'open'
open abstract class Printer(val modelName: String) {



}

class LaserPrinter(modelName: String): Printer(modelName) {



}
