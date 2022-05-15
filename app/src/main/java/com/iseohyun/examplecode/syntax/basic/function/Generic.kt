package com.iseohyun.examplecode.syntax.basic.function

fun main() {
    log("my")
    log(1)
    log('가')
    log(3.14)

    println()

    logString("your")
    logInt(1)
    logChar('나')
    logFloat(9.8f)
}

fun <T> log(a: T) = println(a)

fun logInt(a: Int) = println(a)
fun logFloat(a: Float) = println(a)
fun logString(a: String) = println(a)
fun logChar(a: Char) = println(a)