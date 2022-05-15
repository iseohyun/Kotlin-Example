package com.iseohyun.examplecode.syntax.basic.oop

fun main() {
    val a = AnyClass("수박", 1)
    val b = AnyClass("수박", 1)

    // a == b 와 같음
    println(a.equals(b))

    println(a.hashCode()) // 10진수

    println(a.toString()) // 16진수
    println(a)
    println("%x".format(a.hashCode())) // 10 -> 16
}

class AnyClass(val name: String, val id: Int)