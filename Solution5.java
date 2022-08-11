import java.math.BigInteger;

public class Solution5 {

    // Definition for singly-linked list.
    public static class ListNode {
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

    public static String rek(ListNode l) {
        if (l.next == null) {
            return "" + l.val;
        }
        return rek(l.next) + l.val;
    }

    public static ListNode rek2(ListNode l, String s, int pos) {
        if (pos <= 0) {
            l.val = Integer.parseInt(s.charAt(pos) + "");
            return l;
        }
        l.val = Integer.parseInt(s.charAt(pos) + "");
        // System.out.print(l.val);
        rek2(l.next = new ListNode(), s, pos - 1);
        return l;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger v1 = new BigInteger(rek(l1));
        BigInteger v2 = new BigInteger(rek(l2));
        BigInteger c = v1.add(v2);
        String uus = "" + (c);

        // System.out.println("Sõne = " + uus);
        if (uus.length() == 1)
            return new ListNode(Integer.parseInt(uus.charAt(0) + ""));
        ListNode l3 = new ListNode();
        return rek2(l3, uus, uus.length()-1);
    }

    public static void main(String[] args) {
        /*
        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.
         */
        /*
        [9,9,9,9,9,9,9]
        [9,9,9,9]
         */
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,
                new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        //  ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        //  ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        // String l3 = "" + (Integer.parseInt(rek(l1)) + Integer.parseInt(rek(l2)));
        //  System.out.println(l3);

        ListNode l3 = addTwoNumbers(l1, l2);
        // System.out.println("\nLõpp = " + l3.val +l3.next.val + l3.next.next.val );

        // System.out.println(l3.val);
    }
}
