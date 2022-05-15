package com.iseohyun.examplecode.syntax.basic.function

fun main() {
    highOrderFunc(::funcX)  // 1
}

fun funcX(str: String) {
    println("전달 받은 메시지 : \"$str\"") //3
}

fun highOrderFunc(f: (String) -> Unit) {
    f("나는 funcY 입니다.")  // 2
}