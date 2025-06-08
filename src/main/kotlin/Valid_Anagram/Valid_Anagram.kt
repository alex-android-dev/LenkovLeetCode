package Valid_Anagram

import java.util.Stack

/**
 * Принимает, но долгая скорость
 */

fun main() {
    val solution = Solution()

    println(solution.isAnagram("var", "rav"))
    println(solution.isAnagram("car", "rac"))
    println(solution.isAnagram("car", "cer"))
    println(solution.isAnagram("ab", "a"))
}


class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if (s.length != t.length) return false

        val hashMap = HashMap<Char, Int>()

        /**
         * Теперь у нас есть мапа с частотностью символов
         */
        s.forEach { char ->
            hashMap.put(char, hashMap.getOrDefault(char, 0) + 1)
        }

        t.forEach { char ->

            if (!hashMap.contains(char)) {
                return false
            } else if (hashMap.get(char) == 1) {
                hashMap.remove(char)
            } else {
                hashMap.put(char, (hashMap.get(char)!! - 1))
            }

        }

        return true

    }
}