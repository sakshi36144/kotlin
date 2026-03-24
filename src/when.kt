

// write a Kotlin program to print day of week name using when  case
//import kotlin.io.println
//fun main() {
//    print("Enter the day: ")
//    val day= readln().toInt()
//    when(day){
//        1-> println("mon")
//        2-> println("tus")
//        3-> println("wed")
//        4 -> println("thus")
//        5-> println("fri")
//        6-> println("sat")
//        7-> println("sun")
//        else ->println("")
//    }
//}
fun main(){
    print("Enter the day: ")
    val day =readln().toInt()
    val week =when(day){
        1->"mon"
        2->"tus"
        3->"wed"
        4->"thus"
        5->"fri"
        6->"sat"
        7->"sun"
        else -> "wrong answ"

    }
    println(week)
}
