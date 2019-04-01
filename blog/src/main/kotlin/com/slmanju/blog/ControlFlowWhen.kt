package com.slmanju.blog

fun main(args: Array<String>) {
    dayOfWeek(5)
    whatDay(7)
    examResult(60)
    printType(124)

    println("29 is ${racer(29)}")
    println("30 is ${racer(30)}")
    println("31 is ${racer(31)}")
    println("40 is ${racer(40)}")
    println("41 is ${racer(41)}")
    println("42 is ${racer(42)}")
}

private fun racer(speed: Int): String {
    return when {
        speed in 0..24 -> "Beginner"
        speed in 24..30 -> "Intermediate"
        speed in 30..41 -> "Average"
        speed > 41 -> "Pro"
        else -> "Invalid speed"
    }
}

private fun printType(number: Int) {
    when {
        number < 0 -> println("Negative number")
        number % 2 == 0 -> println("Even number")
        else -> println("Positive odd number")
    }
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