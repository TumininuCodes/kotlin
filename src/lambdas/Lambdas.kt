package lambdas

fun main() {
    val multiplyLambda: (Int, Int) -> Int

    multiplyLambda = { a, b ->
        Int
        a * b
    }

    println(multiplyLambda(4, 5))


    // Using the it keyword
    var doubleLambda = { a: Int ->
        2 * a
    }

    doubleLambda = { it * 2 }
    val square: (Int) -> Int = { it * it }

    println(doubleLambda(4))
    println(square(3))


    // Lambdas as arguments
    fun operateOnNumbers(a: Int, b: Int, operator: (Int, Int) -> Int): Int {
        val result = operator(a, b)
        println(result)
        return result
    }

    val addLambda = { a: Int, b: Int ->
        a + b
    }
    operateOnNumbers(4, 6, addLambda)

    // Returning Unit with Lambdas
    var unitLambda = {
        println("There is a new Kotlin apprentice in town")
    }
    unitLambda()

    // Custom sorting with lambdas
    val names = arrayOf("ZZZZZZ", "BB", "A", "CCCC", "EEEEE")
    names.sorted()

    val namesByLengthDescend = names.sortedWith(compareBy {
        -it.length
    })

    val namesByLengthAscend = names.sortedWith(compareBy {
        +it.length
    })

    println(namesByLengthDescend)
    println(namesByLengthAscend)
}