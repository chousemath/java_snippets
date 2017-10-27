public class DsStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public DsStack (int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stackArray[top] = item;
    }

    public long pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        int oldTop = top;
        top--;
        return stackArray[oldTop];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
