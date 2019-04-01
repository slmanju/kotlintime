package com.slmanju.blog

fun main(args: Array<String>) {
    val a = 10
    val b = 3
    findMax(a, b)
    findMax2(a, b)

    println(directReturn(35))
}

private fun directReturn(age: Int): String {
    return if (age < 21) "You are a kid" else "You are an adult"
}

private fun findMax2(a: Int, b: Int) {
    val result = if (a > b) "$a is greater than $b" else " $b is greater than $a"
    println(result)
}

private fun findMax(a: Int, b: Int) {
    val max: Int = if (a > b) {
        a
    } else {
        b
    }
    println("Max value is $max")
}