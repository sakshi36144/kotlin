package loops
//write a Kotlin all natural numbers from 1 to n  -using while loop
fun main() {
    print("Enter the number: ")
    val n = readln().toInt()
//    var a = 1;
//    while (a <= n){
//        println(a)
//        a++;
//    }

//write a Kotlin all natural numbers from 1 to n  -using for loop
//    for(i  in 1..n )
//        println(i)
for (row in 1..n){
    for (col in 1..n){
        if (row ==1||row ==n||col ==1||col ==n||row == col||col ==n-row+1){
            print("* ")
    }
        else {
            print("")
        }
}
    println()
}}
