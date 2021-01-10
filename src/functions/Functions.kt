package functions

fun main() {
    printMultipleOfFive(10)

    val (product, quotient) = multiplyAndDivide(4, 2)
}

fun printMultipleOfFive(value: Int) {
    println("$value * 5 = ${value * 5}")
}

fun multiplyAndDivide(number: Int, factor: Int): Pair<Int, Int> {
    return Pair(number * factor, number / factor)
}
