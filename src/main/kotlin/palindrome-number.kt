fun main() {
    println(isPalindrome(323))
}

fun isPalindrome(x: Int): Boolean {

    val xReversed = x.toString().reversed()

    return if (x.toString() == xReversed) true
    else false

}