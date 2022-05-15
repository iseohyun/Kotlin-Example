package com.iseohyun.examplecode.syntax.basic.oop

/*
    객체 : 세상의 모든 객체 -> 단위 (class) : 항상 대문자 시작
    접근제어자, 구성(변수 + 함수)
    설계 -> 생성 -> 사용
 */

fun main() {
    val myObj = Object() // 생성 요청

    println(myObj.obj1.name)
    println(myObj.obj2.name)

    myObj.obj2.nameLength()
}

class Object { // 설계도
    val obj1 = SubObj1()
    val obj2 = SubObj2()
}

class SubObj1 {
    val name = "property 1"
}

class SubObj2 {
    val name = "property 2"
    fun nameLength() { // method or function
        println("${name.length} letters")
    }
}