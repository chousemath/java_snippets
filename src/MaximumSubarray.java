import java.util.SortedSet;
import java.util.TreeSet;

public class MaximumSubarray {
    private static SortedSet<Integer> sums = new TreeSet<>();

    private static void maxSubArrayRecursive(int sum, int index, int[] nums) {
        if (index == nums.length) return;
        sum += nums[index];
        sums.add(sum);
        index++;
        maxSubArrayRecursive(0, index, nums);
        maxSubArrayRecursive(sum, index, nums);
    }

    public static int maxSubArray(int[] nums) {
        maxSubArrayRecursive(0, 0, nums);
        return sums.last();
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{1}));
    }
}
