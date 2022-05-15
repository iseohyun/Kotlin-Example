package com.iseohyun.examplecode.syntax.basic.oop

fun main() {
    val a = MyClass()
    println("프로그램 시작")
    println(a)
}

class MyClass {
    init {
        println("초기화(인스턴스화) 될 때 호출됨.")
    }
}