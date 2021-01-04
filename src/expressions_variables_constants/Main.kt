package expressions_variables_constants

import kotlin.math.PI
import kotlin.math.sin

fun main() {

    val a = 4
    val b = 3
    println(a * b)

    // The popular hello world message

    println("Hello World")

    // Basic arithmetic operations

    println(22 / 7)
    println(22.0 / 7)
    println(20.0 % 3.2)

    println(1 shl 3) // This is the same as 1 x 2^3
    println(32 shr 2) // This is the same as 32 / 2^2

    val x = sin(45 * PI / 180)
    println(x)

    val integer: Int = 4

    integer.toDouble()
    println(integer)

}
