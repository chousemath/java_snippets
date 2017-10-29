import java.util.ArrayList;
import java.util.List;

public class TestBinaryNode {
    public static void main(String[] args) {
        BinaryNode nodeA = new BinaryNode();
        nodeA.value = 1;
        BinaryNode nodeB = new BinaryNode();
        nodeB.value = 2;
        BinaryNode nodeC = new BinaryNode();
        nodeC.value = 5;
        BinaryNode nodeD = new BinaryNode();
        nodeD.value = 3;
        BinaryNode nodeE = new BinaryNode();
        nodeE.value = 6;
        BinaryNode nodeF = new BinaryNode();
        nodeF.value = 4;

        nodeA.right = nodeB;
        nodeB.right = nodeC;
        nodeC.left = nodeD;
        nodeC.right = nodeE;
        nodeD.right = nodeF;

        postOrder(nodeA);
    }

    static void postOrder(BinaryNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }
}
