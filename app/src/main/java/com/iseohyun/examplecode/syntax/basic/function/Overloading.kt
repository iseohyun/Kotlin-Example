package com.iseohyun.examplecode.syntax.basic.function

fun main() {
    println(add(1, 2))
    println(add(3L, 4L))
    println(add(3.14, 9.8))
}

fun add(a: Int, b: Int) = a + b

fun add(a: Long, b: Long) = a + b

fun add(a: Double, b: Double) = a + b