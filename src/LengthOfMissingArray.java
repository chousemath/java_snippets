import java.util.SortedSet;
import java.util.TreeSet;

public class LengthOfMissingArray {
    public static int getLengthOfMissingArray(int[][] arrayOfArrays) {
        SortedSet<Integer> lengthSet = new TreeSet<Integer>();
        for(int[] arr : arrayOfArrays) lengthSet.add(arr.length);
        int prev = lengthSet.first();
        for (int i : lengthSet) {
            if (i - prev > 1) return i - 1;
            else prev = i;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getLengthOfMissingArray(new int[][] {
                new int[]{1, 1, 1, 1, 1},
                new int[]{1, 2, 3},
                new int[]{2, 2},
                new int[]{1}
        }));
    }
}
