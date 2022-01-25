package mergetwosortedlists;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode resultHead = new ListNode();
        ListNode currentNode = resultHead;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }

            currentNode = currentNode.next;
        }
        if (list1 != null) currentNode.next = list1;
        if (list2 != null) currentNode.next = list2;
        return resultHead.next;
    }
}
