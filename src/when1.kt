//fun main(){
//    val char= 'A'
//    when {
//        char >='A' && char <= 'Z'->println("alp")
//        char >='0' && char <= '9'->println("num")
//        else -> println("special char")
//
//    }
//}
fun main(){
    val char ='A'
    val ans = when {
        char >='A' && char <= 'Z'-> "alp"
        char >='0' && char <= '9'->"num"
        else -> "special char"
    }
    println(ans)
}