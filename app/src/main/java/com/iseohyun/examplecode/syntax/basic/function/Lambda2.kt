package com.iseohyun.examplecode.syntax.basic.function

// Lambda with MultiLine
fun main() {
    // 함수의 마지막 줄이 리턴이 된다.
    val lambda1 = { ->
        println("한줄")
        println("두줄") // <-- return line: kotlin.Unit
    }

    val lambda2 = { x: Int ->
        val u = x + 1
        u * u // <-- return line: Int
    }

    // 입력 인자가 1개인 경우 [it]으로 대체할 수 있다.
    // 단, 타입추론을 할 수 없음으로 생략이 불가능하다.
    val lambda3: (String) -> String = { "제 이름은 ${it}입니다." }

    println(lambda1())
    println(lambda2(2))
    println(lambda3("홍길동"))
}