public class Node1 {
    Node1 left, right;
    int data;
    public Node1(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if (left == null) left = new Node1(value);
            else left.insert(value);
        } else {
            if (right == null) right = new Node1(value);
            else right.insert(value);
        }
    }

    public boolean contains(int value) {
        boolean containsValue = false;
        if (value == data) containsValue = true;
        else if (value < data) {
            if (left != null) left.contains(value);
        } else {
            if (right != null) right.contains(value);
        }
        return containsValue;
    }

    public void printInOrder() {
        if (left != null) left.printInOrder();
        System.out.println(data);
        if (right != null) right.printInOrder();
    }
}
