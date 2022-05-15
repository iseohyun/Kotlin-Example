package com.iseohyun.examplecode.syntax.basic.oop

fun main() {
    val a = Farther("김개똥")
    val b = Son1("홍길동")
    val c = Son2("임꺽정")

    // 일관된 인터페이스 : 짱짱맨
    Generic(a).introduce()
    Generic(b).introduce()
    Generic(c).introduce()
}

open class Farther(var name : String) {
    open fun whoAmI() { println("A : $name") }
}

class Son1(name : String) : Farther(name) {
    override fun whoAmI() { println("B : $name") }
}

class Son2(name : String) : Farther(name) {
    override fun whoAmI() { println("C : $name") }
}

class Generic<T : Farther>(var t : T) {
    fun introduce() { t.whoAmI() }
}