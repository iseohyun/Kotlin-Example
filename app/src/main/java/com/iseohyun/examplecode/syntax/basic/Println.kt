package com.iseohyun.examplecode.syntax.basic

import java.util.*

// 단순 입출력
fun main1() {
    print("입력하세요(readln) : ")

    val input = readln()
    println("입력된 문장 : $input")
}

// "Scanner"를 이용한 출력
fun main2() {
    print("입력하세요(Scanner) : ")
    val sc = Scanner(System.`in`) // in은 코틀린의 예약어(Reserved keyword)

    val input = sc.nextLine()
    println("입력된 문장 : $input")
}
