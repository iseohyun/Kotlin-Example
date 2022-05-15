package com.iseohyun.examplecode.syntax.basic.oop

fun main() {
    val x = Parents()
    val y = Child()

    x.pub() // --> com.iseohyun.examplecode.syntax.basic.function.A
    //x.prot() // --> Cannot access 'com.iseohyun.examplecode.syntax.basic.function.B': it is protected in 'X'
    //x.priv() // --> Cannot access 'C': it is private in 'X'
    x.default() // --> C
    y.indirect() // --> com.iseohyun.examplecode.syntax.basic.function.B
}

open class Parents {
    public fun pub() { println("com.iseohyun.examplecode.syntax.basic.function.A") }
    protected fun prot() { println("com.iseohyun.examplecode.syntax.basic.function.B") }
    private fun priv() { println("C") }
    fun default() { // 생략되었다면 public 으로 간주한다.
        priv()  // 내부 함수는 private()을 호출 할 수 있다.
    }
}

class Child : Parents() {
    fun indirect() { prot() }
}