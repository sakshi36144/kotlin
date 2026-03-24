//Write a Kotlin program to check whether a number is divisible by 5 and 11 or not.
package q4
import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    print("Enter the number: ")
    val num = sc.nextInt()
     println(if (num %5 == 0 && num % 11 ==0 )"divisible" else "not divisible")
}