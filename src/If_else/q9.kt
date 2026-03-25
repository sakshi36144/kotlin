//Write a Kotlin program to input any character and check whether it is alphabet, digit or special character
package q9
import java.util.Scanner
import kotlin.io.println
fun main() {
    val sc = Scanner(System.`in`)
    print("Enter the Character: ")
    val char= readln()[0]

    val ans = if (char >'a' && char <= 'z'  || char >= 'A' && char <= 'z') "Alphabet" else if (char >= '0' && char <= '9') "It is number" else "special character"

    println(ans)
}