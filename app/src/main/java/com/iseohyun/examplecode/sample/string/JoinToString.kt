package com.iseohyun.examplecode.sample.string

// 글자 리스트 합치기
// concat

fun main() {
    val list = listOf("빨강", "파랑", "노랑", "파랑")

    println(list.joinToString())
    println(list.joinToString(" 그리고 "))
    println(list.joinToString(prefix = "여기부터 ->", postfix = "<-여기까지"))
    println(list.joinToString(limit = 2, truncated = "등등.."))
}