public class DsQueue {
    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public DsQueue(int size) {
        this.maxSize = size;
        this.queueArray = new long[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long data) {
        if (isFull()) System.out.println("Queue is full, data will be overwritten");
        rear++;
        queueArray[rear] = data;
        nItems++;
        if (rear == maxSize - 1) rear = -1;
    }

    public long remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        long frontVal = queueArray[front];
        front++;
        if (front == maxSize) front = 0;
        nItems--;
        return frontVal;
    }

    public long peekFront() {
        return queueArray[front];
    }

    public void view() {
        System.out.print("[");
        for (int i = 0; i < maxSize; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println("]");
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public void clearQueue() {
        for (int i = 0; i < maxSize; i++) {
            System.out.println(queueArray[i] + "=>");
            queueArray[i] = 0;
            front = 0;
            rear = -1;
        }
        System.out.println("Queue has been cleared");
        view();
    }
}
