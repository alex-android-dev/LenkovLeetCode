fun main() {
    println(romanToInteger("CL"))
}

fun romanToInteger(s: String): Int {
    var res: Int = 0

    val romanMap: Map<String, Int> =
        mapOf("I" to 1, "V" to 5, "X" to 10, "L" to 50, "C" to 100, "D" to 500, "M" to 1000)

    for (ind in s.indices) {
        val currentStr = s[ind].toString()
        val currentValue = romanMap[currentStr]

        if (ind + 1 < s.length && currentValue!! < romanMap[s[ind + 1].toString()]!!) {
            res -= currentValue
        } else {
            res += currentValue!!
        }
    }
    return res
}