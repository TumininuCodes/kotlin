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
}