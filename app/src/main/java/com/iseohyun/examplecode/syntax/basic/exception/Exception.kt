package com.iseohyun.examplecode.syntax.basic.exception

fun main() {
    try {
        throw Exception("오류 내용 : 예외 강제 발생") // <-- 1
    } catch (e: Exception) {
        println("오류! -> " + e.message)  // <-- 2 ? 오류 출력
    } finally {
        println("항상 발생") // <-- 3 !!
    }
}