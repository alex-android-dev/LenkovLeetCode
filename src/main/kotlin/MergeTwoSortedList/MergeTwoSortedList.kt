package MergeTwoSortedList

fun main() {
    val list11 = ListNode(1)
    val list12 = ListNode(2)
    val list13 = ListNode(4)

    list11.next = list12
    list12.next = list13

    val list21 = ListNode(1)
    val list22 = ListNode(3)
    val list23 = ListNode(4)

    list21.next = list22
    list22.next = list23

    mergeTwoLists(list11, list21)
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val dummy : ListNode = ListNode(0)
    var tail: ListNode = dummy

    var list1 = list1
    var list2 = list2

    while ((list1 != null) && (list2 != null)) {

        if (list1.`val` < list2.`val`) {
            tail.next = list1
            list1 = list1.next
        } else {
            tail.next = list2
            list2 = list2.next
        }

        tail = tail.next ?: dummy
    }
    tail.next = list1 ?: list2
    return dummy.next
}

class ListNode(
    var `val`: Int,
) {
    var next: ListNode? = null
}