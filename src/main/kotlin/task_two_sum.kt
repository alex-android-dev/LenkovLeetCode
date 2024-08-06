// https://leetcode.com/problems/two-sum/description/


fun main() {
    val intArray: IntArray = intArrayOf(2,7,11,15)

    println(twoSum(intArray, 26).contentToString())

}

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
