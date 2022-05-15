package com.iseohyun.examplecode.syntax.basic.oop

var a = 10 // 패키지 스코프

fun main() {
    val x = X()

    // 패키지 스코프 a 출력
    println(a)

    x.p()

    // 패키지 스코프 a 출력
    println(a)
}

class X() {
    fun p() {
        // 패키지 스코프 a '증가' 및 출력
        println(++a)
    }
}