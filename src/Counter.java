public class Counter {
    // private keyword prevents clients from modifying those values directly
    private String name;
    private int value = 0;

    public Counter(String name) {
     this.name = name;
    }

    public void increment() { value++; }

    public int getCurrentValue() {
        return value;
    }

    public String toString() {
        return name + ": " + value;
    }
}
