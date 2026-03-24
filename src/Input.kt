package input
import  java.util.Scanner
fun main() {

//    val sc = Scanner(System.`in`)
    // To take input in kotlin, we've two function readln()(not null safe) and readLine() (null safe)
    print("Enter your name : ")
//    val name = sc.nextLine()
    val name = readln()
    print("Enter your age : ")
//    val age = sc.nextInt()
    val age = readln().toInt()

    print("Enter your cgpa : ")
//    val cgpa = sc.nextFloat()
    val cgpa = readln().toFloat()

    print("Enter your gender : ")
//    sc.nextLine()
//    val gender = sc.nextLine().get(0)
    val gender = readln()[0]


    println("Your name is $name")
    println("Your age is $age")
    println("Your cgpa is $cgpa")
    println("Your gender is $gender")

}