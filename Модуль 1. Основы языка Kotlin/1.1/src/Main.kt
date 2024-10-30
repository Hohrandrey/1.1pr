fun main() {

    //Задание 1
    /*
    val (a, b, m, n) = readln().split(" ").map { it.toDouble() }
    if ((a >=m && b>=n) or (a >= n && b>=m)){
        println("YES")
    }
    else
        println("NO")

     */

    //Задание 2
    val nukl = readln()

    var count_A = 0
    var count_T = 0
    var count_G = 0
    var count_C = 0

    for (i in nukl) {
        if (i == 'A')
            count_A += 1
        else if (i == 'T')
            count_T += 1
        else if (i == 'G')
            count_G += 1
        else
            count_C += 1
    }

    println("$count_A $count_T $count_G $count_C")
}