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


    val hourOfDay = 12
    val timeOfDay: String

    timeOfDay = when (hourOfDay) {
        0, 1, 2, 3, 4, 5 -> "Early morning"
        6, 7, 8, 9, 10, 11 -> "Morning"
        12, 13, 14, 15, 16 -> "Afternoon"
        17, 18, 19 -> "Evening"
        20, 21, 22, 23 -> "Late evening"

        else -> "INVALID HOUR!"
    }

    println(timeOfDay)

    // Ranges can also be used with when. For example in 0..4
}