package `when`

//Write a Kotlin program to check whether a number is even or odd using when case.
fun main(){
    val a=readln().toInt()
    val num= when{
        a % 2==0 -> "a is even"
        else-> "a is old"
    }
    println(num)
}