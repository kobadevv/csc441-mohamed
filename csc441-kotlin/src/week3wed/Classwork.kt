package week3wed

fun main() {
    println("---Step 1 - main and output---")
    println("CSC 441")
    println("Kotlin, first day")

    println("---Step 2 - val and var---")
    val course = "CSC 441"
    var weekNumber = 3
    weekNumber += 1

    println(course)
    println(weekNumber)

    println("---Step 3 - the four basic types")
    val name = "Mohamed"
    val age: Int = 19
    val gpa: Float = 3.75f
    val learning = true

    println(name)
    println(age)
    println(gpa)
    println(learning)

    println("---Step 4 - String templates")
    println("$name is taking $course")
//    println(name + "is taking " + course)
    println("Next year: ${age + 1}")
    println("Name length: ${name.length}")

    println("---Step 5: Reading input---")
    print("what's your name? ")
    val yourName = readln()
    println("Hello, $yourName")


}