// Write a Kotlin program to check whether a year is leap year or not
package q6
import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    print("Enter the number: ")
    val year= sc.nextInt()
    println(if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) "leap year" else " not leap year")

}