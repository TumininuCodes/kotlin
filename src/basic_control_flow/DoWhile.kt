package basic_control_flow

fun main() {
    var sum = 1

    do {
        sum += 2
        println(sum)
    } while (sum < 3)

    while (true) {
        sum += 3
        println(sum)
        if (sum >= 200) {
            break
        }
    }
}