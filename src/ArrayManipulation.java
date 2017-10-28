import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] intArr = new long[n];

        int m = in.nextInt();

        long max = -1;
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            int k = in.nextInt();

            for (int i = a; i <= b; i++) {
                intArr[i] = intArr[i] + k;
                max = (intArr[i] > max) ? intArr[i] : max;
            }
        }

        in.close();

        System.out.println(max);
    }
}
