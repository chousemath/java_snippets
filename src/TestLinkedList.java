public class TestLinkedList {
    public static void main(String[] args) {
        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        System.out.println("nodeA data = " + nodeA.data);
        System.out.println("nodeB data = " + nodeB.data);
        System.out.println("nodeA-nodeB[data]: " + nodeA.next.data);
        System.out.println("nodeB-nodeC[data]: " + nodeB.next.data);
        System.out.println("nodeC-nodeD[data]: " + nodeC.next.data);

        System.out.println("The length of this list from nodeA is " + listLength(nodeA));
        System.out.println("The length of this list from nodeB is " + listLength(nodeB));
    }

    public static int listLength(Node head) {
        int listLength = 1;
        while (head.next != null) {
            listLength++;
            head = head.next;
        }
        return listLength;
    }
}
