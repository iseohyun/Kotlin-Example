package com.iseohyun.examplecode.syntax.basic.function

/*
https://kotlinlang.org/docs/lambdas.html
 */

fun main() {
    // 1. 입력 출력이 없는 람다.
    // var lambda1: () -> Unit = { println("x 실행") }
    // () -> Unit 생략 : 타입추론
    val lambda1 = { -> println("lambda1 수행 됨") }
    lambda1()

    // 2. 입력 (정수, 정수) -> 출력(정수)
    //var x: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    val lambda2 = { a: Int, b: Int -> a + b }
    println("lambda2 : ${lambda2(5, 6)}")
}