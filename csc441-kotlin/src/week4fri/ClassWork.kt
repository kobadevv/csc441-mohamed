package week4fri

fun main() {
    println("--- Step 1: Two kinds of string ---")
    val firstName: String = "Mohamed"
    val middleName: String? = null

    println(firstName.length)
    println(middleName?.length)

    println("--- Step 2: Safe call ---")
    println(middleName?.length)

    println("--- Step 3: Elvis operator ---")
    println(middleName?.length ?: 0)

    println("--- Step 4: Let ---")
    middleName?.let {
        println("Middle name is : $it")
    }

    println("--- Step 5: The risky one ---")
    val maybeNumber: Int? = 100
    println(maybeNumber!! + 1)

    println("--- Step 6: Where nulls actually come from")
    val notANumber = "banana".toIntOrNull()
    println(notANumber ?: "That was not a number.")

    val capitals = mapOf("France" to "Paris", "Japan" to "Tokyo")
    println(capitals["Canada"] ?: "not in the map")

    val emptyList = listOf<Int>()
    println(emptyList.maxOrNull() ?: "empty list")

    println("--- Step 7: List and MutableList ---")
    val shoppingList = listOf("banana, bread, water")
    val toDoList = mutableListOf("homework", "laundry")

    toDoList.add("dishes")
    toDoList.remove("laundry")

    println(shoppingList)
    println(toDoList)
    println("Items: ${toDoList.size}")

//    shoppingList.add("milk")

    println("--- Step 8: Things lists can do")
    val scores = listOf(90, 72, 85, 64, 98)
    println(scores.sum())
    println(scores.average())
    println(scores.maxOrNull())
    println(scores.sorted())
    println(scores.filter { it >= 80 })

//    if (middleName != null) {
//        println(middleName.length)
//    }
}
