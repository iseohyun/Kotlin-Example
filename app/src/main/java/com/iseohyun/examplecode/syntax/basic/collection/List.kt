package com.iseohyun.examplecode.syntax.basic.collection

fun main() {
    val numbers = listOf(3, 1, 4, 7)
    val planet = mutableListOf("수성", "금성", "지구", "화성")

    outList("숫자열", numbers)

    outList("행성", planet)

    planet.add("목성")
    outList("목성 추가", planet)

    planet.remove("지구")
    outList("지구 삭제", planet)

    planet.sort()
    outList("정렬", planet)

    planet.shuffle()
    outList("무작위 섞기(실행할 때마다 달라짐)", planet)
}

fun <T : List<Any>> outList(sub: String, list: T) {
    print("$sub > ")
    for (i in list.indices) {
        print("${i}:${list[i]}, ")
    }
    println()
}