import java.util.ArrayList;
import java.util.List;

public class IntegersRecreationOne {
    // Given two integers m, n (1 <= m <= n) we want to find all integers between m and n whose sum of squared divisors
    // is itself a square. 42 is such a number.
    // The result will be an array of arrays(in C an array of Pair), each subarray having two elements, first the number
    // whose squared divisors is a square and then the sum of the squared divisors.

    // function that finds all divisors
    static long divisorSquareSum(long x) {
        int squareSum = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) squareSum += i * i;
        }
        double sqrtOfSquareSum = Math.sqrt(squareSum);
        if (sqrtOfSquareSum / Math.round(sqrtOfSquareSum) == 1) return squareSum;
        return -1;
    }

    static String listSquared(long m, long n) {
        List<String> intArrList = new ArrayList<>();
        for (long i = m; i <= n; i++) {
            long potential = divisorSquareSum(i);
            if (potential > 0) intArrList.add("[" + String.join(", " , new String[]{Long.toString(i), Long.toString(potential)}) + "]");
        }
        return "[" + String.join(", ", intArrList) + "]";
    }
    // iterate over List to populate array (or convert to array)
    // return that array

    public static void main(String[] args) {
        System.out.println(listSquared(1, 250));
    }
}
