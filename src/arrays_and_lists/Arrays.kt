package arrays_and_lists

fun main() {
    // This is an array of int i.e. Array<Int> or Integer[]
    val oneToFive = arrayOf(1, 2, 3, 4, 5)

    // This is an array of IntArray, DoubleArray, etc. that is synonymous to primitive types
    var oneToFour = arrayOf(1, 2, 3, 4).toIntArray()
    oneToFour = intArrayOf(1, 2, 3, 4)
}