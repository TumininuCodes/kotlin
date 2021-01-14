package nullability

fun main() {
    val authorName: String? = "Joe Howard"

    val nameLength = authorName?.length
    println("Author's name has length $nameLength")

    val nameLength5 = authorName?.length?.plus(5)
    println("Author's name has length $nameLength5")
}