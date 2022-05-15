package com.iseohyun.examplecode.syntax.basic.oop

fun main() {
    val p = Person("홍길동")
    p.selfIntroduce()

    p.age = 28
    p.selfIntroduce()
}

class Person(var name : String){
    var age : Int = 18 // 반드시 초기화 되어야 한다.
    fun selfIntroduce() {
        println("안녕하세요. 저는 ${age}살 ${name}입니다.")
    }
}