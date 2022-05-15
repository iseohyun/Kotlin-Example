package com.iseohyun.examplecode.syntax.basic.function

// 콜백(Callback) : 요청하는자가 요청시기를 알 수 없을 때, 대상에 나에게 호출해달라고 요청


fun main() {
    regCallback(::action) // 선등록

    run() // 후실행
}

fun action() {
    println("동작 수행")
}

var callbackFunction:(() -> Unit)? = null
fun regCallback(action: () -> Unit) {
    callbackFunction = action
}

fun run() {
    // ... 지금이니?
    callbackFunction?.let { it() }
    callbackFunction!!()    // null 이 들어가면 시스템이 다운 or 재부팅 된다.
}

