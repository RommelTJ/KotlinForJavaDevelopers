package com.rommelrico.s3ooprogramming.inheritance

// To tell compiler that this class can be extended we add 'open'
// Since we declared the class as 'abstract', we no longer need 'open' since it's redundant because abstract classes
// have to be extended.
abstract class Printer(val modelName: String)

class LaserPrinter(modelName: String): Printer(modelName)