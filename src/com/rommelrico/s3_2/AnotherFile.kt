package com.rommelrico.s3_2

import com.rommelrico.s3ooprogramming.CompanyCommunications as Comm
import com.rommelrico.s3ooprogramming.topLevel as tp
import com.rommelrico.s3ooprogramming.Department.IT
import com.rommelrico.s3ooprogramming.Department.*

fun main(args: Array<String>) {
    tp("Test")
    println(Comm.getCopyrightLine())
    println(IT.getDepartmentInfo())
    println(HR.getDepartmentInfo())
}
