import java.util.Hashtable;
import java.util.Scanner;

public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        Hashtable<Integer, Integer> candleTable = new Hashtable<>();
        for (int x : ar) {
            if (candleTable.containsKey(x)) candleTable.put(x, candleTable.get(x) + 1);
            else candleTable.put(x, 1);
        }
        int maxKey = 0;
        for (int x : candleTable.keySet()) maxKey = (maxKey > x) ? maxKey : x;
        return candleTable.get(maxKey);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
