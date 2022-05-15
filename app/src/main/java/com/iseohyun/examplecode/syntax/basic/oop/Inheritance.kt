package com.iseohyun.examplecode.syntax.basic.oop

// 상속
// open 사용

fun main() {
    val animal = Animal("나비", 3, "고양이")
    val dog = Dog("흰둥이", 2)

    animal.whoAmI()
    dog.whoAmI()

    dog.bark()
}

open class Animal(var name : String, var age : Int, var type : String){
    fun whoAmI() { println("$name / $age / $type")}
}

class Dog (name : String, age : Int) : Pet(name, age, "개") {
    fun bark() { println("멍멍") }
}