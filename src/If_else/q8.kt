//Write a Kotlin program to input any alphabet and check whether it is vowel or consonant.
package q8 
import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    print("Enter the number: ")
    val char = 'a'
    println(if (char == 'a'|| char =='e'||char=='i'|| char =='o' ||char =='u' ) "vowel" else " consonant")

}