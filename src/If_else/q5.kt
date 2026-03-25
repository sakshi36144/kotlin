//Write a Kotlin program to check whether a number is even or odd.
package q5
import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    print("Enter the number: ")
    val num = sc.nextInt()
    println(if (num%2 == 0) "even" else "odd")
}