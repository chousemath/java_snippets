public class MergeTwoSortedLinkedLists {
    public static void main(String[] args) {
        LeetListNode nodeA1 = new LeetListNode(0);
        LeetListNode nodeA2 = new LeetListNode(99);
        LeetListNode nodeA3 = new LeetListNode(200);
        LeetListNode nodeA4 = new LeetListNode(2012);
        nodeA1.next = nodeA2;
        nodeA2.next = nodeA3;
        nodeA3.next = nodeA4;

        LeetListNode nodeB1 = new LeetListNode(1);
        LeetListNode nodeB2 = new LeetListNode(2);
        LeetListNode nodeB3 = new LeetListNode(98);
        LeetListNode nodeB4 = new LeetListNode(198);
        LeetListNode nodeB5 = new LeetListNode(201);
        LeetListNode nodeB6 = new LeetListNode(2014);
        LeetListNode nodeB7 = new LeetListNode(10_000);
        nodeB1.next = nodeB2;
        nodeB2.next = nodeB3;
        nodeB3.next = nodeB4;
        nodeB4.next = nodeB5;
        nodeB5.next = nodeB6;
        nodeB6.next = nodeB7;

        printValues(nodeA1);
        printValues(nodeB1);
        printValues(mergeTwoLists(nodeA1, null));
        printValues(mergeTwoLists(nodeB1, null));
        printValues(mergeTwoLists(null, null));
        printValues(mergeTwoLists(nodeA1, nodeB1));
    }

    public static void printValues(LeetListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        System.out.print(head.val + "->");
        printValues(head.next);
    }

    public static LeetListNode mergeTwoLists(LeetListNode l1, LeetListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        LeetListNode low;
        LeetListNode high;
        if (l1.val < l2.val) {
            low = l1;
            high = l2;
        } else {
            low = l2;
            high = l1;
        }
        return mergeRecursive(low, low.next, low, high);
    }

    public static LeetListNode mergeRecursive(LeetListNode head, LeetListNode base, LeetListNode prev, LeetListNode target) {
        if (target == null) return head;
        else if (base == null) prev.next = target;
        else if (base.val < target.val) mergeRecursive(head, base.next, base, target);
        else {
            prev.next = target;
            LeetListNode nextTarget = target.next;
            target.next = base;
            mergeRecursive(head, base, target, nextTarget);
        }
        return head;
    }
}
