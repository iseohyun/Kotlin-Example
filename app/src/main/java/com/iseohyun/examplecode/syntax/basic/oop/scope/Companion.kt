package com.iseohyun.examplecode.syntax.basic.oop.scope

fun main() {
    val a = Menu("짜장")
    val b = Menu("짬뽕")

    a.vote()
    a.vote()
    a.vote()

    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("총계 : ${Menu.total}")
}

class Menu(val name: String) {
    companion object {
        var total = 0
    }

    var count = 0

    fun vote() {
        count++
        total++
    }
}