package com.iseohyun.examplecode.syntax.basic.oop.scope

fun main() {
    var i = 10
    val a = Also(1, "A")

    a.whoAmI() // 1
    println("i(main) : $i")  // 2

    val b = a.also {
        it.str = "B"
        it.i++
        i++ // <-- it이 없다면, 외부의 인자를 참조 할 수 있다.
    }

    b.whoAmI() // 3
    println("i(main) : $i") // 4

    a.whoAmI() // 5
}

class Also(var i: Int, var str: String) {
    fun whoAmI() {
        println("$str : $i")
    }
}