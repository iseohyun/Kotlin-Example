package com.iseohyun.examplecode.sample.string

fun main() {
    val text1: String? = null
    val text2 = ""
    val text3 = "     "
    val text4 = " A"

    println(text1.isNullOrEmpty())
    println(text2.isEmpty())
    println(text3.isEmpty())
    println(text4.isEmpty())

    println()

    println(text1.isNullOrBlank())
    println(text2.isBlank())
    println(text3.isBlank())
    println(text4.isBlank())
}