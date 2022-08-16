package Easy;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution21 {


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;
        if (list2 == null)
            return list1;
        if (list1 == null)
            return list2;

        return mergeRec(list1, list2, new ListNode());
    }

    private static ListNode mergeRec(ListNode list1, ListNode list2, ListNode listNew) {
        if (list1 == null && list2 == null)
            return listNew;

        if (list2 == null) {
            listNew = list1;
            listNew.next = mergeRec(list1.next, list2, listNew.next);
        }

       else if (list1 == null || list1.val >= list2.val) {
            listNew = list2;
            listNew.next = mergeRec(list1, list2.next, listNew.next);
        } else {
            listNew = list1;
            listNew.next = mergeRec(list1.next, list2, listNew.next);
        }
        return listNew;
    }

    /*
        Input: list1 = [1,2,4], list2 = [1,3,4]
        Output: [1,1,2,3,4,4]
     */
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(mergeTwoLists(list1, list2).next.next.next.next.next.val);
    }
}
