fun main(args: Array<String>) {
    print("Number 1: ")
    val input1 = readLine()!!.toDouble()

    print("Number 2: ")
    val input2 = readLine()!!.toDouble()

    print("Operation (+, -, x, /): ")
    val operation = readLine()

    val result = when (operation) {
        "+" -> input1 + input2
        "-" -> input1 - input2
        "x" -> input1 * input2
        "%" -> input1 / input2
        else -> throw Throwable("Unsupported operation")
    }
    println("Your result: $result")
}