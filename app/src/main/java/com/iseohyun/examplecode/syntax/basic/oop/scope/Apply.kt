package com.iseohyun.examplecode.syntax.basic.oop.scope

// apply 함수
// 변경 내용을 자기자신에게 적용한 뒤, 본인을 반환

fun main() {
    val a = Apply(1, "A")
    a.whoAmI() // 1

    val b = a.apply {
        i++
        str = "B"
    }
    a.whoAmI() // 2
    b.whoAmI() // 3
}

class Apply(var i: Int, var str: String) {
    fun whoAmI() {
        println("$str : $i")
    }
}