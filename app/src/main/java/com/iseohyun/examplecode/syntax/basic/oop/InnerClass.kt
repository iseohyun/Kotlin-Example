package com.iseohyun.examplecode.syntax.basic.oop

// 예약어 없음(nested class) : 독립된 객체
// inner (inner class) : 종속된 객체

fun main() {
    Outer.Nested().introduce()
    //Outer.Inner().introduceInner() //Error

    val outer = Outer()
    val inner = outer.Inner()

    inner.introduceInner()
    inner.introduceOuter()

    outer.text = "Changed Outer Class"
    inner.introduceOuter()
}

class Outer {
    var text = "Outer Class"

    class Nested {  // 독립된 객체
        fun introduce() {
            println("Nested Class")
            //println(text) // 참조 할 수 없음
        }
    }

    inner class Inner { // 종속된 객체
        private var text = "Inner Class" // 이 부분이 주석되어 있다면, 자동으로 외부 참조
        fun introduceInner() {
            println(text)
        }

        fun introduceOuter() {
            println(this@Outer.text)
        }
    }
}