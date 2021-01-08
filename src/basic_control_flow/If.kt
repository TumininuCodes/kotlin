package basic_control_flow

fun main() {
    if (2 < 3) {
        println("2 is less than 3")
    }

    val animal = "Fox"

    if (animal.toLowerCase() == "cat" || animal.toLowerCase() == "dog") {
        println("Animal is a house pet")
    } else {
        println("Animal is not a house pet")
    }


    val a = 4
    val b = 5

    val min = if (a < b) a else b
    val max = if (a > b) a else b

    println(min)
    println(max)


    val hourOfTheDay = 12
    val timeOfTheDay = if (hourOfTheDay < 6) {
        "Early morning"
    } else if (hourOfTheDay < 12) {
        "Morning"
    } else if (hourOfTheDay < 17) {
        "Afternoon"
    } else if (hourOfTheDay < 20) {
        "Evening"
    } else if (hourOfTheDay < 24) {
        "Late evening"
    } else {
        "INVALID HOUR"
    }

    println(timeOfTheDay)


    val myAge = 19

    val ageGrade = if (myAge > 13 && myAge < 19) {
        "You are a teenager"
    } else
        "You are not a teenager"

    println(ageGrade)
}