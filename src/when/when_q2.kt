//package `when`
//
////Write a Kotlin program to check whether an alphabet is vowel or consonant using  when  case.
//fun If_else.main(){
//    val alph = readln()[0]
//    val alp = when(alph){
//        'a','e','i','o','u'-> "vowel"
//        'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'-> "consonant"
//        else -> "this is not alphabet"
//    }
//    println(alp)
//}
fun main() {
    when ('a'){
        in "aeiou" ->println("It is a vowel")
        else -> println("consonant")
    }
}