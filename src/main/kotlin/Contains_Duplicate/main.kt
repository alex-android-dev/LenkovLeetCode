package Contains_Duplicate

fun main() {

    val firstArr = intArrayOf(0, 1, 2, 3, 5, 9, 8, 2)

    println(
        containsDuplicate(firstArr)
    )

}


fun containsDuplicate(nums: IntArray): Boolean {
    val numsHashSet : HashSet<Int> = hashSetOf()

    for (i in nums) {
        if (!numsHashSet.contains(i)) numsHashSet.add(i)
        else return true
    }

    return false
}