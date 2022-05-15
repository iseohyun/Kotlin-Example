package com.iseohyun.examplecode.syntax.basic.oop

fun main() {
    val a = Data("수박", 1)

    println(a.copy())
    println(a.copy(name = "참외"))
    println(a.copy(id = 3))
}

data class Data(val name: String, val id: Int)