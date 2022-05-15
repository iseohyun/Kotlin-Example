package com.iseohyun.examplecode.syntax.basic.oop.scope

fun main() {
    val a = With(1, "A")

    a.whoAmI() // 1

    val tmpStr = with(a) {
        str = "B"
        i++
        "(with)"
    }

    println(tmpStr) // 2

    a.whoAmI() // 3
}

class With(var i: Int, var str: String) {
    fun whoAmI() {
        println("$str : $i")
    }
}