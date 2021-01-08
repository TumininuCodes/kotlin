package basic_control_flow

fun main() {

    val guess = "dog"

    // Comparison using equal to
    val dogEqualCat = guess == "cat"

    println(dogEqualCat)

    // Greater than or lesser than operator are evaluated alphabetically
    val order = ("cat" < "dog")
    println(order)

    // This means higher alphabets are greater than lower alphabets
}