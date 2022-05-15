package com.iseohyun.examplecode.syntax.basic.oop


fun main() {
    val a = Human("홍길동", 20)
    val b = Human("임꺽정") // 나이를 입력하지 않았지만 자동으로 입력됨
    val c = Human(30)

    a.whoAmI()
    b.whoAmI()
    c.whoAmI()
}

class Human(var name : String, var age : Int){
    // 이름만 입력한 경우
    constructor(name : String) : this(name, 25)
    // 나이만 입력한 경우
    constructor(age : Int) : this("아무개", age)

    fun whoAmI() {
        println("$name / $age")
    }
}