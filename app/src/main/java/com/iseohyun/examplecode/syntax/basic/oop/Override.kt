package com.iseohyun.examplecode.syntax.basic.oop

fun main() {
    val a = Pet("나비", 3, "고양이")
    val b = Puppy("흰둥이", 2, "강아지")

    a.whoAmI()
    b.whoAmI()
    b.whoAmI2()
}

open class Pet(var name : String, var age : Int, var type : String){
    open fun whoAmI() { println("$name / $age / $type")}
}

class Puppy (name : String, age : Int, type : String) : Pet(name, age, type) {
    // override
    override fun whoAmI() {
        println("$name / $age / \"멍멍\"")
    }

    fun whoAmI2(){ super.whoAmI() }
}