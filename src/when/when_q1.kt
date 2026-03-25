package `when`//List of when case programming exercises

     //Write a when program print total number of days in a month using when case.
     fun main(){
         val day =readln().toInt()
         val month =when(day){
             1,3,5,7,8,10,12-> "31 days"
             4,6,9,11->"30days"
             2 -> "28 and 29 days"
             else -> "wrong and"
         }
         println(month)
     }


















//Write a C program to check whether an alphabet is vowel or consonant using switch case.
//Write a C program to find maximum between two numbers using switch case.
//Write a C program to check whether a number is even or odd using switch case.
//Write a C program to check whether a number is positive, negative or zero using switch case.
//Write a C program to find roots of a quadratic equation using switch case.
//Write a C program to create Simple Calculator using switch case.