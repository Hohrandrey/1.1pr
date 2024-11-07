fun countVowels(str: String): Int {

    val vowels = setOf('a', 'e', 'i', 'o', 'u')

    var count = 0

    for (char in str.toLowerCase()) {
        if (char in vowels) {
            count++
        }
    }
    return count
}

fun main() {
    val inputStr = readln()
    println(countVowels(inputStr))
}