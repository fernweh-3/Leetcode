import java.util.ArrayList;
import java.util.List;

public class M2130MaximumTwinSumofaLinkedList {


    public int pairSum(ListNode head) {
//        int length = 1;
//        int max = 0;
//        List<Integer> list = new ArrayList<>();
//        list.add(head.val);
//        while (head.next != null) {
//            length++;
//            list.add(head.next.val);
//            head = head.next;
//        }
//        for (int i = 0; i < length / 2; i++) {
//            max = Math.max(max, list.get(i) + list.get(length - i - 1));
//        }
//        return max;


        ListNode secondHalf = head, pointer = head, copy = head;
        while (pointer != null && pointer.next != null) {
            secondHalf = secondHalf.next;
            pointer = pointer.next.next;
        }
        ListNode nextNode = null, prev = null;
        while (secondHalf != null) {
            nextNode = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = nextNode;
        }
        int max = 0;
        while (prev != null) {
            max = Math.max(max, prev.val + copy.val);
            prev = prev.next;
            copy = copy.next;
        }
        return max;

    }
}
