package `when`

//Write a Kotlin program to create Simple Calculator using when case.
fun main() {
    println("Enter first number: ")
    val a = readln().toInt()

    println("Enter operator (+, -, *, /): ")
    val op = readln()

    println("Enter second number: ")
    val b = readln().toInt()

    val result = when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "Invalid operator"
    }

    println(result)
}