//fun main(args: Array<String>) {
//    var char: Char = 'a'
//    if (char >= 'a' && char < 'b') {
//
//        println("lower case")
//        if (char >= 'A' && char < 'B') {
//            println("upper case")
//        }
//
//    }
//}


package If

fun main(args: Array<String>) {
//    val a = 199; val b = 118; val c = 1288

//    if (a > b){
//        println("Maximum is $a")
//    }
//    else {
//        println("Maximum is $b")
//    }

    val a = 199;
    val b = 118898;
    val c = 1288
    // maximum between 3
//    if (a > b) {
//        if (a > c) {
//            println("Maximum is $a")
//        } else {
//            println("maximum is $c")
//
//        }
//    } else {
//        if (b > c) {
//            println("Maximum is $b")
//        } else {
//            println("Maximum is $c")
//        }
//    }

    if(a > b && a > c)
        println("Maximum is $a")
    else if (b > c)
        println("Maximum is $b")
    else
        println("Maximum is $c")


    // max between 2
    var max = if (a > b)
        a
    else
        b
    println("maximum is $max")

    // max between 3
    max = if (a > b && a > c)
        a
    else if (b > c)
        b
    else // else compulsory in expression
        c

    println("maximum is $max")


    val char :Char = 'a'

    println(if (char >'a' && char <= 'z') "Lower case" else if (char >= 'A' && char <= 'z') "upper case" else "")











}

/*
What is Conditional Statement?
    Conditional Statement is used to execute block of code whether a condition is true or false.
        Types of Conditional Statement :
        -> if - else statement
        -> when - case - statement
        -> conditional operator (kotlin not support

        if - else statement : (4 way to use)
        - if - statement : Used only to execute code based on condition only.
        Syntax :
        if (condition ){
            // block of code
        }

        if - else statement :

            if (condition){
                // code
            }
            else {
                // block of code
            }

        Ladder if-else statement :
        Syntax :
        if (condition) {
            // block of code
        }else if (condition2 ){
             // block of code
        }else if (condition3 ){
            // block of code
        }...
        else {
            // block of code
        }
*/


fun main() {

//    Write a Kotlin program to find maximum between two numbers.
//    Write a Kotlin program to find maximum between three numbers.
    val num1 = 11;
    val num2 = 19

    // by using only if statement
    // max between
//    if (num1 > num2) {
//        println("Maximum is ${num1}")
//    }
//
//    if (num2 > num1) {
//        println("Maximum is ${num2}")
//    }
//
    // max between 3
    val num3 = 100

    if (num1 > num2){
        if (num1 > num3){
            println("maximum is ${num1}")
        }
    }

    if (num2 > num1){
        if (num2 > num3)
            println("maximum is $num2")
    }

    if (num3 > num1 ){
        if (num3 > num2 ){
            println("Maximum is $num3")
        }
    }

    if ( num1 > num2 && num1 > num3){
        println("Maximum is $num1")
    }
    if ( num2 > num1 && num2 > num3){
        println("Maximum is $num2")
    }
    if ( num3 > num1 && num3 > num2){
        println("Maximum is $num3")
    }


}

