package `when`

//Write a Kotlin program to find maximum between two numbers using when case.
fun main(){
    val a=readln()
    val b=readln()
    val max= when{
        a>b ->"a is max"
        else->"b is max"
    }
    println(max)
}