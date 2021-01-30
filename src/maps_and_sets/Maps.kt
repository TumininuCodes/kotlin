package maps_and_sets

fun main() {
    val yearOfBirth = mapOf("Anna" to 1990, "Tumi" to 2001, "Jide" to 1999)

    val namesAndScores = mutableMapOf("Anna" to 2, "Brian" to 2, "Craig" to 8, "Donna" to 6)
    println(namesAndScores)

    val pairs = hashMapOf("Anna" to 1990, "Tumi" to 2001, "Jide" to 1999)
    println(pairs)

    // Adding pairs to maps
    val bobData = mutableMapOf("name" to "Bob", "profession" to "CardPlayer", "country" to "USA")
    bobData.put("state", "CA")
    // there are other ways this can be done though


    // Updating values
    bobData.put("name", "Bobby")

    // Removing pairs
    bobData.remove("country")

    println(bobData)
}