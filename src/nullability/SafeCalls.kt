package nullability

fun main() {
    val authorName: String? = "Joe Howard"
    var nonNullableAuthor: String

    var nameLength = authorName?.length
    println("Author's name has length $nameLength")

    val nameLength5 = authorName?.length?.plus(5)
    println("Author's name has length $nameLength5")

    // Using safe call with the let() function
    authorName?.let {
        nonNullableAuthor = authorName
        nameLength = authorName.length

        println(nonNullableAuthor)
        println(nameLength.toString())
    }

}