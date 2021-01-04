package types_and_operations

fun main() {

    val cordinatesInt: Pair<Int, Int> = Pair(2, 3)
    val cordinatesDouble = Pair(2.1, 3.1)
    val cordinatesWithTo = 2 to 3
    val cordinatesMixed = Pair(2.1, 3)

    println(cordinatesInt)
    println(cordinatesDouble)
    println(cordinatesWithTo)
    println(cordinatesMixed)

    // And here is how to access the data
    val x1 = cordinatesInt.first
    val y1 = cordinatesInt.second

    println(x1)
    println(y1)

    // This can also be done
    val (x, y) = cordinatesInt
    println(x)
    println(y)
}