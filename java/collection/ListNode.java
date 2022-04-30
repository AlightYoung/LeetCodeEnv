package collection;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
        val = x;
        next = null;
    }

    // generate a list from an array
    public static ListNode generateList(Object[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        ListNode head = new ListNode((int) array[0]);
        ListNode node = head;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            node.next = new ListNode((int) array[i]);
            node = node.next;
        }
        return head;
    }

    // tostring
    public String toString() {
        StringBuilder strb = new StringBuilder();
        ListNode node = this;
        while (node != null) {
            strb.append(node.val + " ");
            node = node.next;
        }
        return strb.toString();
    }

    // reverse list
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
