package com.rommelrico.s3_2

import com.rommelrico.s3ooprogramming.CompanyCommunications
import com.rommelrico.s3ooprogramming.topLevel
import com.rommelrico.s3ooprogramming.Department.IT
import com.rommelrico.s3ooprogramming.Department.*

fun main(args: Array<String>) {
    topLevel("Test")
    println(CompanyCommunications.getCopyrightLine())
    println(IT.getDepartmentInfo())
    println(HR.getDepartmentInfo())
}
