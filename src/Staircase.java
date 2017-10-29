import java.util.Scanner;

public class Staircase {
    static void printStairs(int total, int index) {
        String stairs = "";
        for (int i = 0; i < total - index - 1; i++) stairs += " ";
        for (int i = 0; i <= index; i++) stairs += "#";
        System.out.println(stairs);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < n; i++) {
            printStairs(n, i);
        }
    }
}
