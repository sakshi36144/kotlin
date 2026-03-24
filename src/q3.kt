//Write a Kotlin program to check whether a number is negative, positive or zero
package q3
import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    print("Enter the number: ")
    val num =  sc.nextInt()
    if (num  == 0) {
        println("Zero")
    }
    if(num < 0){
        println("negative")
    }
    if(num>0){
        println("positive")
    }

}
