// Write a Kotlin program to check whether a character is alphabet or not
package q7
import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    print("Enter the number: ")
    val char = 'a'
    println(if (char >'a' && char <= 'z'  || char >= 'A' && char <= 'z') "Alphabet" else " not Alphabet")

}