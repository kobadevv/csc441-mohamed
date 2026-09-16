package week4wed

fun main() {
    println("---Step 1: function returning nothing---")
    todaysExercise()

    println("---Step 2: function returning a value---")
    println("Today I'll do ${todaysExercise1()}")

    println("---Step 3: a parameter---")
    println(todaysExercise2(3))
    println(todaysExercise2(9))

    println("---Step 4: the short form---")
    println(todaysExercise3(3))

    println("---Step 5: a default value")
    println(todaysExercise4())
    println(todaysExercise4(2))

    println("---Step 6: two parameters, and naming them---")
    println(todaysExercise5(2, "Mohamed"))
    println(todaysExercise5(name = "Sam"))
}

fun todaysExercise() {
    println("Push-ups")
}

fun todaysExercise1(): String {
    return "Push-ups"
}

fun todaysExercise2(dayNumber: Int): String {
    return when (dayNumber) {
        1 -> "Push-ups"
        2 -> "Running"
        3 -> "Swimming"
        4 -> "Cycling"
        5 -> "Weights"
        else -> "Rest day"
    }
}

fun todaysExercise3(dayNumber: Int): String = when (dayNumber) {
    1 -> "Push-ups"
    2 -> "Running"
    3 -> "Swimming"
    4 -> "Cycling"
    5 -> "Weights"
    else -> "Rest day"
}

fun todaysExercise4(dayNumber: Int = 1): String = when (dayNumber) {
    1 -> "Push-ups"
    2 -> "Running"
    3 -> "Swimming"
    4 -> "Cycling"
    5 -> "Gym"
    else -> "Rest day"
}

fun todaysExercise5(dayNumber: Int = 1, name: String = "you"): String {
    val exercise = when (dayNumber) {
        1 -> "Push-ups"
        2 -> "Running"
        3 -> "Swimming"
        4 -> "Cycling"
        5 -> "Gym"
        else -> "Rest day"
    }
    return "$name is $exercise"
}