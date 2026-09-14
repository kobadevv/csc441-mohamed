package week3fri

fun main() {
    for (num in 1..10) {
        print("$num ")
    }
    println()

    for (i in 20 downTo 1 step 3) {
        print("$i ")
    }
    println()

    val packList = mutableListOf("Phone", "Passport", "Wallet", "Backpack")
    for (p in packList) {
        println("$p ")
    }

    packList.forEachIndexed { index, string ->
        println("$index is $string")
    }

    for (i in 0 until packList.size) {
        println("$i: ${packList[i]}")
    }

    print("Pick a #, 1-7: ")
    val num: Int = readln().toInt()

    val day = when (num){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        else -> println("Sunday")
    }

    val age = 19
    val maturity = if (age > 18) "Adult" else "Not an Adult"
    println(maturity)
}