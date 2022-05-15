package com.iseohyun.examplecode.syntax.basic.function

// 가변 인자 받기

fun main() {
    myFunc("1행", 1, 2)
    myFunc("2행", 1, 2, 3)
    myFunc("3행", 2, 3, 4, 5, 6)

}

fun myFunc(str: String, vararg numbers: Int) {
    var sum = 0
    print("$str > ")
    for (i in numbers) {
        if (sum != 0)
            print(" + ")
        print(i)
        sum += i
    }
    println(" = $sum")
}