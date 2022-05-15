package com.iseohyun.examplecode.sample.string

fun main() {
    val text1 = "Kotlin Programming Guide"

    // 글자 위치를 알고 있을 때 :
    println(text1.substring(5..10))

    // 시작글자를 검증할 때,
    println("start : " + text1.startsWith("Kotlin"))
    println("start2: " + text1.startsWith("kotlin"))

    // 마지막 글자를 검증 할 때,
    println("end : " + text1.endsWith("Guide"))

    // 포함 여부를 확인 할 때,
    println("gram : " + text1.contains("gram"))
    println("Java : " + text1.contains("java"))

    // 글자의 위치를 알고 싶을 때,
    println("[Program]은 ${text1.indexOf("Program")}번째에 있습니다.")
    println("[G]는 ${text1.indexOf("G", ignoreCase = true )}번째에 있습니다.")
}