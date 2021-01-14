package nullability

fun main() {

    // The elvis operator is ?:
    var nullableInt: Int? = 10
    var mustHaveResult = nullableInt ?: 0
    println(mustHaveResult)

    /* Using the Elvis operator means mustHaveResult will equal either the value inside nullableInt, or 0 if
     nullableInt contains null. In this example, mustHaveResult is inferred to be of type Int and contains the
     concrete Int value of 10 */

    nullableInt = null

    mustHaveResult = nullableInt ?: 0
    println(mustHaveResult)
}