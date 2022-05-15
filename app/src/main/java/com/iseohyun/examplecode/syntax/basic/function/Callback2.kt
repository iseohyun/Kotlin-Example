package com.iseohyun.examplecode.syntax.basic.function

/*
예를들어, 센서업체에서 모듈을 제작해서 팔 때, 또는 운영체제를 만들 때, (해당기능에 대하여)
제작자는 해당 함수가 언젠가 호출되어야 할 것은 알지만, 누가 언제 호출 할 지는 알 수 없고,
미래에 사용자가 정해지면 비로소 사용자와 제작자의 호출관계가 성립됩니다.
이 때, 제작자는 나중에 호출 될 함수이름만 정해주고, 미래에 사용자가 해당 함수를 자기 입맛에 맞게 정의해서 사용하는 구조를 Callback 구조라고 합니다. (반대말 Call)

시나리오. 제작자가 [Sensor]를 개발할 때,
 [Sensor]는 무언가 측정하여 측정된 5번 중 1번씩 계속 [Listener]에게 보내주도록 설정 하였다.
 나중에 사용자가 [Sensor]를 구입했고, 사용자는 [Sensor]값을 관찰하여 30을 넘어가면 경고가 뜨도록 설치하였다.
 */

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

class UserClass : Listener {
    override fun onEvent(parameter: Int) {
        if (parameter < 30)
            println("$parameter : Good")
        else
            println("$parameter : Warning")
    }

    fun start() {
        val ss = Sensor(this)
        ss.powerOn()
    }
}