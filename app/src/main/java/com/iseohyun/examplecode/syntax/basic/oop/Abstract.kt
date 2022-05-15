package com.iseohyun.examplecode.syntax.basic.oop

fun main() {
    val thing = Thing()

    thing.breathing()
}

abstract class LivingThing {
    // abstract 함수는 body 가 없다.
    abstract fun breathing()
}

class Thing : LivingThing() {
    // 추상화 대상은 반드시 override 되어야 한다.
    override fun breathing() {
        println("씁씁 후후")
    }
}