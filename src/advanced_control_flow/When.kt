package advanced_control_flow

fun main() {
    val number = 10

    when (number) {
        0 -> {
            println("This is a zero digit")
        }
        10 -> {
            println("This is a non-zero number")
        }
    }

    val string = "Dog"

    when (string) {
        "Cat", "Dog" -> println("Animal is a house pet.")
        else -> println("Animal is not a house pet.")
    }

    val numberName = when (number) {
        2 -> "two"
        4 -> "four"
        6 -> "six"
        8 -> "eight"
        10 -> "ten"
        else -> {
            println("Unknown number")
            "Unknown"
        }
    }

    println(numberName)
}