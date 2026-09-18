package week4wed

fun main() {
    println("--- Step 1: function returns nothing ---")
    describeToday()

    println("--- Step 2: function returns a String ---")
    println("What's your favorite thing? ${favoriteThing()}")

    println("--- Step 3: takes a Int parameter ---")
    println(pickOne(3))
    println(pickOne(6))

    println("--- Step 4: in short form ---")
    println(pickOneShort(2))

    println("--- Step 5: adds default Int value & a String parameter ---")
    println(pickWithDefault())
    println(pickWithDefault(4))
    println(pickWithDefault(name = "Sam"))
}

fun describeToday() {
    println("Had English, Networking (Cyber Sec), and CSC441 today. Classes went smoothly.")
}

fun favoriteThing(): String {
    return "Sleep; a rare commodity."
}

fun pickOne(num: Int): String {
    return when (num) {
        1 -> "Kotlin"
        2->"Python"
        3 -> "Java"
        4 -> "GD Script"
        else -> "C#"
    }
}

fun pickOneShort(num: Int): String = when (num) {
    1 -> "Kotlin"
    2->"Python"
    3 -> "Java"
    4 -> "GD Script"
    else -> "C#"
}

fun pickWithDefault(num: Int = 1, name: String = "Mohamed"): String {
    val csLanguage = when (num) {
        1 -> "Kotlin"
        2->"Python"
        3 -> "Java"
        4 -> "GD Script"
        else -> "C#"
    }
    return "$name: $csLanguage"
}



