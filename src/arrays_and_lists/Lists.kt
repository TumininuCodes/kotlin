package arrays_and_lists

fun main() {
    val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars")
    // The above can also be written as listOf<String>(...)
    println(innerPlanets)

    val innerPlanetsArrayList = arrayListOf("Mercury", "Venus", "Earth", "Mars")
    println(innerPlanetsArrayList)

    // Note: Neither of the two values initialised above are mutable. We have mutable list for this

    val outerPlanets = mutableListOf("Jupiter", "Saturn", "Uranus", "Neptune")
    println(outerPlanets)

    val players = mutableListOf("Alice", "Bob", "Sandra", "Dan")
    println(players.isEmpty())
    if (players.size < 2)
        println("We need at least two players!")
    else
        println("Let's start!")
    var currentPlayer = players.first()
    println(currentPlayer)
    println(players.last())

    val minPlayer = players.min()
    println(minPlayer)
    minPlayer.let {
        println("$minPlayer will start") // > Alice will start
    }

    // Obviously, first() and min() will not always return the same value. For example:
    println(arrayListOf(2, 3, 1).first())
    println(arrayListOf(2, 3, 1).min())

    val firstPlayer = players[0]
    val secondPlayer = players.get(1)

    println("$firstPlayer\n$secondPlayer")

    // Using ranges with lists
    val upcomingPlayerSlice = players.slice(1..2)
    println(upcomingPlayerSlice.joinToString())

    fun isEliminated(player: String): Boolean {
        return player !in players
    }

    println(isEliminated("Tumi"))

    // You can also use the contains() method
    players.slice(1..3).contains("Bob")

    // Adding elements to a list
    players.add("Gina")
    players.add(0, "Alex")
    players += "Silas"
    println(players.joinToString())

    // Adding element to an array initialised with var
    var array = arrayOf(1, 2, 3)
    array += 4
    println(array.joinToString())

    // Removing elements
    var removedPlayers = players.remove("Alex")
    println(removedPlayers)
    //This method does two things: It removes the element and then returns a Boolean indicating whether the
    //removal was successful, so that you can make sure the cheater has been removed
    val removedAt = players.removeAt(2)
    println(removedAt)


    // Using the index function to locate an element
    print(players.indexOf("Dan").toString())
}

