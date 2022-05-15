package com.iseohyun.examplecode.syntax.basic.oop.scope

// object = Singleton
// 어디서든 접근 가능(공유)

fun main() {
    val w1 = Worker1()
    val w2 = Worker2()

    w1.work()
    w2.work()
    w2.work()
    w1.work()
}

object MySetting {
    private var switch = false
    fun toggle(): String {
        switch = !switch
        return if(switch) "On" else "Off"
    }
}

class Worker1 {
    fun work() = println("Worker1 : " + MySetting.toggle())
}

class Worker2 {
    fun work() = println("Worker2 : " + MySetting.toggle())
}