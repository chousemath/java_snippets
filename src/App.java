public class App {
    public static void main(String[] args) {
        Counter counter = new Counter("My Counter");
        System.out.println("Initial state of counter");
        System.out.println("The current value of counter is " + counter.getCurrentValue());
        System.out.println(counter.toString());

        counter.increment();
        System.out.println("Counter after incrementing");
        System.out.println("The current value of counter is " + counter.getCurrentValue());
        System.out.println(counter.toString());
    }
}
