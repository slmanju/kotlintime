package com.slmanju.blog

fun main(args: Array<String>) {
//    val name = "Kotlin"
    val age = 4

    val name = "Jon Snow"

    val role: String
    role = "King in the north"

    val helpUs = "Save Wilpattu"
    val pi = 3.14

    println(helpUs::class.simpleName)
    println(pi::class.simpleName)
}

object Constants {
    const val THE_END = "All men must die"
}