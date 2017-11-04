import java.util.Scanner;

public class AnotherHighestProductOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        int h = 1;
        int l = 1;
        int l2 = 1;
        int h2 = 1;
        int m = 1;

        for (int x : arr) {

            m = m > l2 * x ? m : l2 * x;
            m = m > h2 * x ? m : h2 * x;

            l2 = l2 < l * x ? l2 : l * x;
            l2 = l2 < h * x ? l2 : h * x;

            h2 = h2 > h * x ? h2 : h * x;
            h2 = h2 > l * x ? h2 : l * x;

            l = l < x ? l : x;
            h = h > x ? h : x;

            System.out.print("h:" + h + " ");
            System.out.print("l:" + l + " ");
            System.out.print("h2:" + h2 + " ");
            System.out.print("l2:" + l2 + " ");
            System.out.println("m:" + m);
        }
    }
}
