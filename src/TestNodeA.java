public class TestNodeA {
    public static void main(String[] args) {
        NodeA a = new NodeA();
        a.data = 3;

        NodeA b = new NodeA();
        b.data = 4;

        NodeA c = new NodeA();
        c.data = 5;

        a.next = b;
        b.next = c;

        show(a);

        NodeA d = new NodeA();
        d.data = 80;

        NodeA e = new NodeA();
        e.data = 90;

        NodeA f = new NodeA();
        f.data = 100;

        NodeA g = new NodeA();
        g.data = 110;

        d.next = e;
        e.next = f;
        f.next = g;

        NodeA newHead = insertNth(d, 6, 2);
        show(d);
    }

    public static void show(NodeA head) {
        if (head == null) System.out.println("null");
        else {
            System.out.print(head.data + "->");
            show(head.next);
        }
    }

    public static NodeA insertNth(NodeA head, int data, int position) {
        // cover case when head is null
        if (head == null) {
            head = new NodeA();
            head.data = data;
        } else {
            // create a new node
            NodeA newNode = new NodeA();
            newNode.data = data;
            // cover case where position is 0
            if (position == 0) {
                newNode.next = head;
                return newNode;
            }

            // move to position before desired position
            int currentPosition = 0;
            NodeA holderNode = head;
            while (currentPosition != position - 1) {
                currentPosition++;
                holderNode = holderNode.next;
            }
            NodeA oldNode = holderNode.next;
            holderNode.next = newNode;
            newNode.next = oldNode;
        }

        return head;
    }
}
