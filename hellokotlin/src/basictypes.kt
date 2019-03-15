fun main(args: Array<String>) {
    // numeric types
    val aInt: Int = 100
    val aDouble: Double = 100.0
    val aFloat: Float = 100.0f
    val aLong: Long = 100
    val aShort: Short = 10
    val aByte: Byte = 1

    println("Int value is $aInt")
    println("Double value is $aDouble")
    println("Float value is $aFloat")
    println("Long value is $aLong")
    println("Short value is $aShort")
    println("Byte value is $aByte")

    // string, character, boolean
    val aString: String = "Kotlin"
    val aChar: Char = 'K'
    val aBoolean: Boolean = true

    println("String value is $aString")
    println("Char value is $aChar")
    println("Boolean value is $aBoolean")

    // array
    val aArray: Array<String> = arrayOf("Kotiln", "World")
    println("Array is ${aArray[0]} ${aArray[1]}")
}
