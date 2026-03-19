/*
Escaped Characters : It is used to more format to text.
     - Escaped character always start from `\` and use inside double quotes.
     List of Escaped Characters :
        -> "\n" : New line character is used to give next line between text.
        -> "\t" : Tab space character use to give tab space between text.
        -> "\\" : Backslash character used to give single backslash.
        -> ' \" ' : Used to give double quote in text.
        -> " \' " : Used to give single quote in text.
        -> "\b" : Used to clear a character from given text.
        -> "\r" : Inserts a carriage return.
        -> "\$" : Inserts a dollar sign character to prevent string interpolation.
 */
package Escaped
fun main(args : Array<String>){
    println("hello, my name  is sakshi\n")
    println("\t\t\t hello,my name is sakshi ")
    println("sakshi\\pal")
    println("sakshi\b")
    println(" this file uses only\' pratics ")
    println("my name is\" sakshi")
    println("price \$12")
    println("hello\rhi")

}