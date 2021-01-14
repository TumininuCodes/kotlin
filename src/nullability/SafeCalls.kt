package nullability

fun main() {
    val authorName: String? = "Joe Howard"

    var nameLength = authorName?.length

    println("Author's name has length $nameLength")
}