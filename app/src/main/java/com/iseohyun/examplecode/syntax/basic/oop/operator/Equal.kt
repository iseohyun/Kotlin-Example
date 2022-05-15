package com.iseohyun.examplecode.syntax.basic.oop.operator

fun main() {
    val a = Classmate("김철수", 18)
    val b = Classmate("김철수", 18)
    val c: Classmate = a
    val d = Classmate("김영희", 18)

    println(a == b) // 내용은 같지만,
    println(a === b) // 다른 사람임

    println(a == c) // 내용도 같고
    println(a === c) // 같은 사람

    println(a == d) // 다른 사람
    println(a === d)
}

class Classmate(var name: String, var age: Int) {
    // ==를 재정의 함
    override fun equals(other: Any?): Boolean {
        return if (other is Classmate) {
            other.name == name && other.age == age
        } else {
            false
        }
    }
}