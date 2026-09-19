package week4fri

fun main() {
    println("--- Step 1: Two kinds of String ---")
    val movie: String = "The Odyssey"
    val director: String? = "Christopher Nolan"
    val directorNull: String? = null

    println(movie.length)

    println("--- Step 2: A safe call ---")
    println(directorNull?.length)

    println("--- Step 3: The Elvis operator ---")
    println(directorNull?.length ?: "That was not a director (String).")

    println("--- Step 4: let ---")
    director?.let {
        println("Director is : $it")
    }

    directorNull?.let {
        println("Director is: $it")
    }

    println("--- Step 5: toIntOrNull() test ---")
    val notANumber = "Christopher Nolan".toIntOrNull()
    println(notANumber ?: "Christopher Nolan is not a number")

    println("--- Step 6: A listOf ---")
    val moviesList = listOf<String>("The Odyssey", "Tenet", "Interstellar", "Oppenheimer")
    println(moviesList)

    println("--- Step 7: A mutableListOf ---")
    val directorsList = mutableListOf<String>("Christopher Nolan", "Quentin Tarantino", "Ryan Coogler", "Martin Scorsese")
    directorsList.add("Denis Villeneuve")
    directorsList.remove("Ryan Coogler")

    println(directorsList)
    println(directorsList.size)

    println("--- Step 8: A list of numbers")
    val criticRatings = listOf<Int>(78, 84, 82, 90, 70)
    println(criticRatings.sum())
    println(criticRatings.average())
    println(criticRatings.filter { it >= 80 })
}

