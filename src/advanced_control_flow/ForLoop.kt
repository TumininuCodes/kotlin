package advanced_control_flow

fun main() {

    val count = 10
    var sum = 0

    for (i in 1..count) {
        sum += i
        println(sum)
    }

    sum = 0

    for (i in count downTo 1 step 2) {
        sum += i
        println(sum)
    }

    sum = 1
    var lastSum = 0
    repeat(10) {
        val temp = sum
        sum += lastSum
        lastSum = temp
        println(lastSum)
    }


}