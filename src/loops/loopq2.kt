package loops
//Write a Kotlin program to print all natural numbers in reverse (from n to 1). – using while loop
fun main() {
    print("Enter the number: ")
    var n = readln().toInt()
    val a = 1;

        // while
//    while (n >= a) {
//        println(n)
//        n--;
//    }
          //for
    for(a in n downTo  a){
        println(a)
    }
}
