import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniMax {
    public static long[] findMinMax(long[] arr) {
        List<Long> intList = new ArrayList<>();
        for (long x : arr) intList.add(x);
        long min = -1;
        long max = -1;
        for (int i = 0; i < intList.size(); i++) {
            // store original value temporarily
            long temp = intList.get(i);
            // setting value at that index to zero is basically removing it
            intList.set(i, 0L);
            // calculate sum of list elements
            long potential = intList.stream().mapToLong(x -> x).sum();
            // either assign first min value or check for minimum
            if (min == -1) min = potential;
            else min = (min < potential) ? min : potential;
            // check for maximum
            max = (max > potential) ? max : potential;
            // set value at index back to original
            intList.set(i, temp);
        }
        return new long[]{min, max};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for (long x : findMinMax(arr)) System.out.print(x + " ");
        System.out.println();
    }
}
