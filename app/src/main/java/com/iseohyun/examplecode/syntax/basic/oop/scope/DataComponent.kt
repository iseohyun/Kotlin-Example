package com.iseohyun.examplecode.syntax.basic.oop.scope

fun main() {
    val list = listOf( DataComponent("수박", 1),
        DataComponent("딸기",5),
        DataComponent("참외",3))

    for((a,b) in list) {
        println("$a, $b")
    }
    list.forEach{ print(it.component1()) }
}

data class DataComponent(val name: String, val id: Int)