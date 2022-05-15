package com.iseohyun.examplecode.syntax.basic.oop.scope

fun main() {
    val a = Run(1, "A")

    a.whoAmI() // 1

    val tmpStr = a.run {
        str = "B"
        i++
        "(run)"
    }

    println(tmpStr) // 2

    a.whoAmI() // 3
}

class Run(var i: Int, var str: String) {
    fun whoAmI() {
        println("$str : $i")
    }
}