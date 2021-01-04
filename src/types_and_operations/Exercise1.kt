package types_and_operations

const val a = 1.0
const val b = 2.0

fun main() {

    val average = (a + b) / 2
    println(average)

    var dF = 74.0
    val celcius = (dF - 32) / 1.8
    println("Celsius temperature is $celcius")

    val bigString =
        """
                Hi! My name is Tumininu Ojo. I am a software developer and I love solving problems
                Yeah, so there is nothing much or big to say about me... yet
                So yeah, that's it. We have tested Kotlin's multiline string feature
            """.trimIndent()

    println(bigString)
}