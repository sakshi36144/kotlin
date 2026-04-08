package Array

fun main() {
//    val size = readln().toInt()
//    var a = 0
//    val list = Array<Int>(size){++a}
//    println(list[0])

    val list = arrayOf(91, 23, 3, 4, 5)
    var i = 0
    for (i in list)
        println(i)
//     val list1=list[0]+ list[1]+list[2]+list[3]+list[4]
//    println(list1)

//    max number
    val list2 = arrayOf(3, 4, 5)
    if (list2[0] > list2[1]) println("max" + list2[0])
    if (list2[1] > list2[2]) println("max" + list2[1])
    if (list2[2] > list2[0]) println("max" + list2[2])


// min number
    if (list2[0] > list2[1]) println("min" + list2[1])
    if (list2[1] > list2[2]) println("min" + list2[2])
    if (list2[2] > list2[0]) println("min" + list2[0])

    //  count even or odd
    val l = arrayOf(3, 4, 5, 2)
    for (i in l)
        when {
            i % 2 == 0 -> println("even")
            else -> println("odd")
        }

//    reverse an array

    val list3 = arrayOf(3, 4, 5)
//    for(i in list3[2] downTo list3[0] )
//        println(list3[i])

//    for(i in list3[0] downTo list3[2] )
    //println(i)
    ///search an element in array
    val list4 = arrayOf(3, 4, 5)
    println(list4.indexOf(3))
//    sort an array
    ///merge the array
    val list5 = arrayOf(3, 2, 4, 1)
    val list6 = arrayOf(3, 2, 4, 1)
    var n = list5.size
    var m = list6.size
   val list7 =list5+list6
    for (a in list7)
        println(a)
}



