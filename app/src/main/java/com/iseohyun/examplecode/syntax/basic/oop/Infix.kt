package com.iseohyun.examplecode.syntax.basic.oop

fun main() {
    val a = Infix("Class A.")
    val b = Infix("Class B.")

    println("1 : " + a.str)
    a concat b
    println("2 : " + a.str)
    a concat (b)
    println("3 : " + a.str)

}

infix fun Infix.concat(b: Infix) {
    this.str += b.str
}

class Infix(var str: String)