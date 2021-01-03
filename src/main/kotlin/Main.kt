// Imports
import kotlin.math.*

// Do you know that comments in Kotlin can be nested?

fun main() {

    // val is like value and var is like variable

    val a = 4
    val b = 3
    println(a*b)

    // The popular hello world message

    println("Hello World")

    // Basic arithmetic operations

    println(22/7)
    println(22.0 / 7)
    println(20.0 % 3.2)

    // So shl is a way of multiplying using 2 and shr is a 
    // way of diving by 2

    println(1 shl 3) // This is the same as 1 x 2^3
    println(32 shr 2) // This is the same as 32 / 2^2

    val x = sin(45 * PI / 180)
    println(x)

    val integer : Int = 4
    val decimal : Double = 3.0
    integer.toDouble()
    println(integer)

}
