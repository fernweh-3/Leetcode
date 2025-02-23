import java.util.ArrayList;
import java.util.List;

public class RemoveNodeFromEndLinkedList {


    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */


    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            nodes.add(cur);
            cur = cur.next;
        }

        int removeIndex = nodes.size() - n;
        if (removeIndex == 0) {
            return head.next;
        }

        nodes.get(removeIndex - 1).next = nodes.get(removeIndex).next;
        return head;

    }

    public ListNode removeNthFromEndIteration(ListNode head, int n) {
        int N = 0;
        ListNode cur = head;
        while (cur != null) {
            N++;
            cur = cur.next;
        }

        int removeIndex = N - n;
        if (removeIndex == 0) {
            return head.next;
        }

        cur = head;
        for (int i = 0; i < N - 1; i++) {
            if ((i + 1) == removeIndex) {
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }
        return head;
    }
}