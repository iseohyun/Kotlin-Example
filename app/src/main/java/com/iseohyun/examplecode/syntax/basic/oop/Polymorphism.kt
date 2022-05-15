package com.iseohyun.examplecode.syntax.basic.oop

fun main() {
    val worker1 = Worker1("홍길동")
    val worker2 = Worker2("임꺽정")
    var job : Operable

    job = worker1
    job.work()

    job = worker2
    job.work()
}

interface Operable {
    fun work()
}

class Worker1(var name : String) : Operable
{
    override fun work() { println("$name : 우다다다") }
}

class Worker2(var name : String) : Operable
{
    override fun work() { println("$name : 오도도도") }
}