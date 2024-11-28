package `20`.Valid_Parentheses

import java.util.Stack

fun main() {

    val s1 = "()[]{}"
    val s2 = "{[()]}"
    val s3 = "){"
    val s4 = "(}{)"

    val list = listOf(s1, s2, s3, s4)

    for (i in list) {
        println("${list.indexOf(i)}: ${Solution().isValid(i)}")
    }

}

class Solution {

    fun isValid(s: String): Boolean {

        val brackets: Map<Char, Char> = mapOf(
            ')' to '(',
            '}' to '{',
            ']' to '['
        )
        val stack = Stack<Char>()

        for (char in s) {

            if (!brackets.containsKey(char)) {
                stack.push(char)
            } else {
                val top = if (stack.isEmpty()) '.'
                else stack.pop()

                if (top != brackets[char]) return false

            }
        }
        return stack.isEmpty()
    }
}