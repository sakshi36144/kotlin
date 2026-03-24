//Write a Kotlin program to input week number and print week day.
fun main() {
    print("Enter week number (1-7): ")
    val week = readln().toInt()

    if (week == 1) {
        println("monday")
    } else if (week == 2) {
        println("tuesday")
    } else if (week == 3) {
        println("wednesday")
    } else if (week == 4) {
        println("thursday")
    } else if (week == 5) {
        println("friday")
    } else if (week == 6) {
        println("saturday")
    } else if (week == 7) {
        println("sunday")
    } else {
        println("invalid input")
    }
}