public class TestDsQueue {
    public static void main(String[] args) {
        DsQueue myQ = new DsQueue(5);
        myQ.insert(1);
        myQ.insert(2);
        myQ.insert(3);
        myQ.insert(4);
        myQ.insert(5);
        myQ.insert(6);

        myQ.view();
        myQ.clearQueue();

        myQ.insert(11);
        myQ.insert(22);
        myQ.insert(33);
        myQ.insert(44);
        myQ.insert(55);
        myQ.insert(66);

        myQ.view();
    }
}
