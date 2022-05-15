package com.iseohyun.examplecode.syntax.basic.oop

fun main() {
    val product: General = Premium()

    product.run() // 1
    // 기능은 가지고 있지만 사용할 수 없다.
    //product1.run2()

    if (product is Premium) {
        product.run2()    // 2 기능을 '잠깐' 사용할 수 있다.
    }

    //product.run2() // 사용할 수 없다.

    val copy = product as Premium // 앞으로 쭉 변환시킨다.
    product.run2()    // 3
    copy.run2()    // 4

}

open class General {
    fun run() {
        println("일반 기능")
    }
}

class Premium : General() {
    fun run2() {
        println("확장 기능")
    }
}