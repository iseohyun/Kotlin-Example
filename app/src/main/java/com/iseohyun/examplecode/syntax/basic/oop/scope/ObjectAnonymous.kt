package com.iseohyun.examplecode.syntax.basic.oop.scope

fun main() {
    val myRobot = UserClass()
    myRobot.start()
}

interface Listener {
    fun onEvent(parameter: Int)
}

class Sensor(private var l: Listener) {
    fun powerOn() {
        for (i in 1..60) {
            if (i % 5 == 0)
                l.onEvent(i)
        }
    }
}

class UserClass {
    fun start() {
        val ss = Sensor(object : Listener { // 원래라면 [Listener]를 생성 또는 '상속 후 다형성으로' 넘겨 주어야 하나...
            override fun onEvent(parameter: Int) {
                if (parameter < 30)
                    println("$parameter : Good")
                else
                    println("$parameter : Warning")
            }
        })
        ss.powerOn()
    }
}