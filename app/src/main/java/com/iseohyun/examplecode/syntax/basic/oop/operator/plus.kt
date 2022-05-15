package com.iseohyun.examplecode.syntax.basic.oop.operator

/*
https://kotlinlang.org/docs/operator-overloading.html#increments-and-decrements
    +a      a.unaryPlus()
    -a      a.unaryMinus()
    !a      a.not()

    a++     a.inc()
    a--     a.dec()

    a + b   a.plus(b)
    a - b   a.minus(b)
    a * b   a.times(b)
    a / b   a.div(b)
    a % b   a.rem(b)

    a..b    a.rangeTo(b)
    a in b  b.contains(a)
    a !in b !b.contains(a)

    a[i]    a.get(i)
    a[i, j] a.get(i, j)
    a[i_1, ..., i_n]
                a.get(i_1, ..., i_n)
    a[i] = b    a.set(i, b)
    a[i, j] = b a.set(i, j, b)
    a[i_1, ..., i_n] = b
                a.set(i_1, ..., i_n, b)
    a()     a.invoke()
    a(i)    a.invoke(i)
    a(i, j) a.invoke(i, j)
    a(i_1, ..., i_n)
                a.invoke(i_1, ..., i_n)

    a += b  a.plusAssign(b)
    a -= b  a.minusAssign(b)
    a *= b  a.timesAssign(b)
    a /= b  a.divAssign(b)
    a %= b  a.remAssign(b)

    a == b  a?.equals(b) ?: (b===null)       ※ equals(other: Any?): Boolean
    a != b  !(a?.equals(b) ?: (b===null))

    a > b   a.compareTo(b) > 0
    a < b   a.compareTo(b) < 0
    a >= b  a.compareTo(b) >= 0
    a <= b  a.compareTo(b) <= 0
 */

fun main() {
    val genes = listOf(
        "근면한", "정직한", "의지력 좋은", "차분한", "사교적인", "주도적인", "온건한", "조용한",
        "따뜻한", "아름다운", "키 큰", "지적인", "대범한", "낙관적인", "관대한"
    )
    val father = Family(genes.shuffled().subList(0, 4))
    val mother = Family(genes.shuffled().subList(0, 4))
    val son = father + mother

    println("아빠 : ${father.gene}")
    println("엄마 : ${mother.gene}")
    println("아들 : ${son.gene}")
}

class Family(val gene: List<String>) {
    operator fun plus(mate: Family): Family {
        val newGen = this.gene + mate.gene
        return Family(newGen.shuffled().subList(0, 4))
    }
}