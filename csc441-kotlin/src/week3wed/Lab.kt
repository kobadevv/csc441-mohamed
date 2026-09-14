package week3wed

fun main() {
    // Val & Var
    val name = "Mohamed"
    val major = "Computer Science"
    val favFood = "sushi"
    val age: Int = 19
    val gitVer: Double = 2.55

    var cscTaken: Int = 2
    cscTaken += 1


    // Output
    println("My name is $name, I am $age years old.")
    println("Currently I am taking $major.")
    println("I have taken ${cscTaken-1} csc courses before this.")
    println("This course will mark $cscTaken csc courses taken.")
    println("Fun fact: My favorite food is $favFood.")
    println("The word $favFood is ${favFood.length} letters long.")
    println("I am currently running Git Version: $gitVer.")
    print("Whats 10^2?: ")
    val ans: Int = readln().toInt()
    val isEqual: Boolean = (ans == 10*10)
    println("10^2 = $ans? $isEqual")
}
