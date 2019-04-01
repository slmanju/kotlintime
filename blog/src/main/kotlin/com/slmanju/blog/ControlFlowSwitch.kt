package com.slmanju.blog

fun main(args: Array<String>) {
    dayOfWeek(5)
    whatDay(7)
    examResult(60)
}

private fun examResult(marks: Int) {
    when (marks) {
        in 1..60 -> println("You failed")
        in 60..100 -> println("You passed")
        else -> println("Invalid number")
    }
}

private fun whatDay(dayOfWeek: Int) {
    when (dayOfWeek) {
        2, 3, 4, 5, 6 -> println("Weekday")
        1, 7 -> println("Weekend")
        else -> println("Invalid Day")
    }
}

private fun dayOfWeek(dayOfWeek: Int) {
    when (dayOfWeek) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid Day")
    }
}