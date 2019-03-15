fun main(args: Array<String>) {
    println("sum1(2, 3) ${sum1(2, 3)}")

    printme1()
    printme1("Jon", 20)
    printme1("Jon")
    printme1(age = 25)

    forLoop1()
    forLoop2()
    forLoop3()
}

fun sum1(number1: Int, number2: Int): Int {
    return number1.plus(number2)
}

fun printme1(name: String = "Manjula", age: Int = 35) {
    println("$name, $age")
}

fun forLoop1() {
    val items = arrayOf(1, 2, 3, 4, 5)
    for (item in items)
        println(item)
}

fun forLoop2() {
    val items = arrayOf("One", "Two", "Three", "Four", "Five")
    for (index in items.indices)
        println("item at $index is ${items[index]}")
}

fun forLoop3() {
    for (i in 1..5) print(i)
    println()
    for (i in 5 downTo 1) print(i)
    println()
    for (i in 1..10 step 2) print(i)
    println()
}