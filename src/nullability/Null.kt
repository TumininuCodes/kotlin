package nullability

fun main() {
    // You declare a variable of a nullable type by using the following syntax
    var errorCode: Int?

    errorCode = 100
    errorCode = null

    val result: Int? = 30
    println(result)

    var authorName: String? = "Joe Howard"
    var authorAge: Int? = 24

    val ageAfterBirthday = authorAge!! + 1
    println("After his next birthday, author's age will be $ageAfterBirthday")
}