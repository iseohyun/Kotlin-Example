package com.iseohyun.examplecode.syntax.basic.oop

fun main() {
    val a = Animals("흰둥이", 2, "강아지")

    a.whoAmI()
    a.run()
    a.eat()
}

interface Runnable {
    fun run()
}

interface Eatable {
    fun eat() { println("함냐함냐") }
}

class Animals(var name : String, var age : Int, var type : String)
    : Runnable, Eatable
{
    fun whoAmI() { println("$name / $age / $type") }
    override fun run() { println("다다다다") }
}