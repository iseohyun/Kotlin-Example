package com.iseohyun.examplecode.syntax.basic.exception

fun main() {
    print("숫자를 입력하세요 : ")

    // 1. 숫자를 입력해 본다.
    // 2. 문자를 입력해 본다.
    val input = readln()

    val num = try {
        input.toInt()
    } catch (e: NumberFormatException) {
        println("숫자가 아닙니다.")
    }

    println("입력 받은 수 : $num")
}