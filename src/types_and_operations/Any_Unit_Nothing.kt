package types_and_operations

fun main() {
    val anyNumber: Any = 45
    val anyString: Any = "45"

    println(anyNumber)
    println(anyString)

    add()
}

// This function returns a Unit type. Similar to void in Java

fun add(): Unit {
    val result = 2 + 2
    println(result)
}

// Lol, don't run this, it is the land of nothing

fun doNothingForever(): Nothing {
    while (true) {

    }
}