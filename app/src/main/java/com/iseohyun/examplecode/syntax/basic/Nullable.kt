package com.iseohyun.examplecode.syntax.basic

/*
?. : null safe operator
?: : elvis operator
!!. : non-null assertion operator
*/

fun main() {
    val str: String? = null

    println(str?.length)    // 위험하면 실행되지 않습니다.
    println(str ?: "default".length)    // [Null]이라면 대체할 객체를 작성합니다.
    println(str!!.length)   // 해줘! (아님 말고)
}