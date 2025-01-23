package Valid_Anagram

fun main() {
    val solution: Solution = Solution()

    println(solution.isAnagram("var", "rav"))
}


class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        if (s.toCharArray().sorted() ==
            t.toCharArray().sorted()) return true
        return false
    }
}