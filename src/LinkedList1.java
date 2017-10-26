public class LinkedList1 {
    LinkedList1 next;
    int data;

    public LinkedList1(int data) {
        this.data = data;
    }


}

class LinkedList {
    LinkedList1 head;

    public void append(int data) {
        if (head == null) {
            head = new LinkedList1(data);
            return;
        }
        LinkedList1 current = head;
        while (current.next != null) current = current.next;
        current.next = new LinkedList1(data);
    }

    public void prepend(int data) {
        LinkedList1 newHead = new LinkedList1(data);
        newHead.next = head;
        head = newHead;
    }

    public void deletewithValue(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        LinkedList1 current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}