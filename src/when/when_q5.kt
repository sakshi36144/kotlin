package `when`

//Write a Kotlin program to check whether a number is positive, negative or zero using when case.
fun main(){
    val a = readln().toInt()
    val num =when{
        a>0->"positive num"
        a<0->"negative num"
        a==0->"zero num"
        else -> "this is not the number"
    }
    println(num)
}