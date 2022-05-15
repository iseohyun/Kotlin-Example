package com.iseohyun.examplecode.syntax.basic.oop

fun main() {
    val a = InfixA("Class A.")
    val b = InfixA("Class B.")

    println("1 : " + a.str)
    a concat b
    println("2 : " + a.str)
    a concat (b)
    println("3 : " + a.str)

}

class InfixA(var str: String) {
    infix fun concat(b: InfixA) {
        str += b.str
    }
}