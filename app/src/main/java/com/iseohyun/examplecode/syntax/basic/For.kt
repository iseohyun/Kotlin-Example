package com.iseohyun.examplecode.syntax.basic
// for - array

@Suppress ("unused")
fun mainFor() {
    val year = arrayOf('갑','을','병','정','무','기','경','신','임','계')
    for(i in year){
        print("$i ")
    }
}

// for - range
@Suppress ("unused")
fun forRange() {
    for(i in 1..10){
        print("$i ")
    }
}

// for - step
@Suppress ("unused")
fun forStep() {
    for(i in 1..10 step 3){
        print("$i ")
    }
}

// for - downTo
@Suppress ("unused")
fun forDownTo() {
    for(i in 10 downTo 0){
        print("$i ")
    }
}

// for -  char
@Suppress ("unused")
fun forChar() {
    for(c in 'a'..'f')
        print(c)
    println()

    for(c in '0'..'f')
        print(c)
    println()

    for(c in '가'..'나')
        print(c)
}

// for - while
@Suppress ("unused")
fun forWhile() {
    var i = 0
    while(i < 3){
        ++i
        print("$i ")
    }
}

// for - do .. while
@Suppress ("unused")
fun forDoWhile() {
    var i = 0
    do{
        ++i
        print("$i ")
    }while(i < 3)
}

// for break
@Suppress ("unused")
fun forBreak() {
    for(i in 1..10) {
        println(i)
        if(i==3) break
    }
}

// for continue
@Suppress ("unused")
fun forContinue() {
    for(i in 1..10) {
        println(i)
        if(i==3) continue //[break]에서 [continue]로 변경
    }
}

// for label
// Scenario - 구구단을 출력중에 2단까지만 출력하고 정지한다고 가정
@Suppress ("unused")
fun forLabel() {
    loop@for(i in 2..9)
        for(j in 1..9) {
            if(i==4)
                break@loop
            println("$i x $j = ${i*j}")
        }
}
