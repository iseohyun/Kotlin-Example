package com.iseohyun.examplecode.syntax.basic.oop

fun main() {
    val a = ClassA(1)
    a.whoAmI() // A : 1

    val b = ClassB(2)
    b.whoAmI() // B : 2

    val c: ClassA = ClassB(3)
    c.whoAmI() // B : 3

//    var d : B = A(4)	// Error
//    d.whoAmI()
}

open class ClassA(private var value: Int) {
    fun whoAmI() {
        val str = when (this) {
            is ClassB -> "B"
            is ClassA -> "A" // always true
            else -> "X"
        }
        println("$str : $value")
    }
}

class ClassB(value: Int) : ClassA(value)