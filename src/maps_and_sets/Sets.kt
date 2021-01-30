package maps_and_sets

fun main() {
    val names = setOf("Anna", "Brian", "Craig", "Anna")
    println(names)

    // You can also use hashSetOf()

    // Adding elements
    val someSets = mutableSetOf(1, 2, 3, 4)
    someSets.add(5)
    println(someSets)
    someSets.remove(5)
    println(someSets)
}