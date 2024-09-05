fun main() {
    println(romanToInteger("MMMMLCV"))
}

fun romanToInteger(str: String): Int {
    var resultInteger: Int = 0

    val romanMap: Map<String, Int> =
        mapOf("I" to 1, "V" to 5, "X" to 10, "L" to 50, "C" to 100, "D" to 500, "M" to 1000)

    val listOfInt: MutableList<Int> = mutableListOf()

    str.map {
        listOfInt.add(romanMap[it.toString()]!!)
    }

    // Заполнили лист значениями

    for (ind in listOfInt.indices) {
        val currentNumber = listOfInt[ind]

        if (ind == listOfInt.size - 1) {
            resultInteger += currentNumber
            break
        }

        val nextNumber = listOfInt[ind + 1]
        if (currentNumber == 500 || currentNumber == 1000) {
            resultInteger += currentNumber
        } else if (currentNumber < nextNumber) {
            resultInteger -= currentNumber
        } else if (currentNumber > nextNumber) {
            resultInteger += currentNumber
        } else {
            resultInteger += currentNumber
        }
    }

    return resultInteger
}

// todo: избавиться от !!. Добавить null безопасность