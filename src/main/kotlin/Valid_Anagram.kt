fun main() {
    val solution: Solution = Solution()

    println(solution.isAnagram("aacc", "ccac"))
}


class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if (s.length != t.length) return false

        val firstWordList: MutableList<String> = mutableListOf()
        val secondWordList: MutableList<String?> = mutableListOf()

        s.map { firstWordList.add(it.toString()) }
        t.map { secondWordList.add(it.toString()) }

        for (ind in firstWordList.indices) {
            val str = firstWordList[ind]
            for (ind in secondWordList.indices) {
                if (str == secondWordList[ind]) {
                    secondWordList[ind] = null
                    break
                }
            }
        }

        return if (secondWordList.all { it == null }) {
            true
        } else {
            false
        }

    }
}