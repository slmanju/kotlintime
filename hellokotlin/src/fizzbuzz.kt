fun main(args: Array<String>) {
    fb3(0, 20)
}

fun fb3(from: Int, to: Int) {
    fun isFizz(k: Int) = k % 3 == 0
    fun isBuzz(k: Int) = k % 5 == 0
    for (number in from..to) {
        when {
            isFizz(number) && isBuzz(number) -> println("Fizz Buzz")
            isFizz(number) -> println("Fizz")
            isBuzz(number) -> println("Buzz")
            else -> println(number)
        }
    }
}

fun fb2(from: Int, to: Int) {
    fun isFizz(k: Int) = k % 3 == 0
    fun isBuzz(k: Int) = k % 5 == 0
    for (number in from..to) {
        if (isFizz(number) && isBuzz(number)) {
            println("Fizz Buzz")
        } else if (isFizz(number)) {
            println("Fizz")
        } else if (isBuzz(number)) {
            println("Buzz")
        } else {
            println(number)
        }
    }
}

fun fb1(from:Int, to:Int): Unit {
    for (number in from..to) {
        if (number % 3 == 0 && number % 5 == 0) {
            println("Fizz Buzz")
        } else if (number % 3 == 0) {
            println("Fizz")
        } else if (number % 5 == 0) {
            println("Buzz")
        } else {
            println(number)
        }
    }
}