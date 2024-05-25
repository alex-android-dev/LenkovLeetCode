


class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            val firstNum = nums[i]

            for (j in i + 1 until nums.size) {
                val secondNum = nums[j]
                if (firstNum + secondNum == target) {
                    val result = intArrayOf(i,j)
                    return result
                }
            }
        }
        return intArrayOf()
    }
}