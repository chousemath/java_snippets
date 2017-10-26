public class MakeNegative {
    public static int makeNegative(final int x) {
        return (x < 0) ? x : -x;
    }

    public static void main(String[] args) {
        System.out.println("Hello from MakeNegative");
        System.out.println("-5 is already negative: " + makeNegative(-5));
        System.out.println("2 is not yet negative: " + makeNegative(2));
    }
}
