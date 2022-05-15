package com.iseohyun.examplecode.syntax.basic.function

/*
고차함수(high order function) : 함수를 입력으로 받는 함수
 */

fun main() {
    val x: (Int, Int) -> Int
    x = ::funcA
    highOrderFunction(x)    // 1
}

fun funcA(x: Int, y: Int): Int {
    return x + y // 3
}

fun highOrderFunction(f: (Int, Int) -> Int) {
    println(f(5, 6)) // 2, 4
}