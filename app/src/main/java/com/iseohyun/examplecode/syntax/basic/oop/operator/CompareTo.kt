package com.iseohyun.examplecode.syntax.basic.oop.operator

fun main() {
    val me = TestResult(58, 69, 97, 91)
    val friend = TestResult(98, 87, 70, 64)

    if (me > friend) {
        "내가 이겼다."
    } else {
        "내가 졌다."
    }.run { println(this) }

    println("내 총점 : ${me.total}")
    println("친구 총점 : ${friend.total}")
}

//result
class TestResult(
    private val korean: Int,
    private val english: Int,
    private val math: Int,
    private val science: Int
) {
    val total get() = korean + english + math + science
    operator fun compareTo(b: TestResult): Int {
        return this.korean + this.english + this.math + this.science - b.korean - b.english - b.math - b.science
    }
}