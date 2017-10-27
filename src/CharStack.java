public class CharStack {
    int maxSize;
    char[] stackArray;
    int top;

    public CharStack(int size) {
        this.maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char c) {
        if (isFull()) {
            System.out.println("Stack is already full");
            return;
        }
        top++;
        stackArray[top] = c;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is already empty");
            return '!';
        }
        int oldTop = top;
        top--;
        return stackArray[oldTop];
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return '!';
        }
        return stackArray[top];
    }

    public boolean isFull() {
        if (top == maxSize - 1) return true;
        return false;
    }

    public boolean isEmpty() {
        if (top == -1) return true;
        return false;
    }
}
