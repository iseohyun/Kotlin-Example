package com.iseohyun.examplecode.syntax.basic

val a = 10 // 패키지 스코프

fun main() {
    println(a) // 패키지

    val a = 11
    println(a) // com.iseohyun.examplecode.syntax.basic.function.main 로컬

    if(true){
        println(a) // com.iseohyun.examplecode.syntax.basic.function.main 로컬
        val a = 12
        println(a) // if 로컬
    }
}