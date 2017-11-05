import java.util.*;

public class CoinDenominations {

    private static SortedSet<Integer> ways = new TreeSet<>();

    private static void findCombination(int[] nums, int target, int sum, int tracker) {
        if (sum > target) return;
        if (sum == target) {
            ways.add(tracker);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            findCombination(nums, target, sum + nums[i], tracker + (int) Math.pow(10, i));
        }
    }

    public static void main(String[] args) {
        int target = 4;
        int[] nums = new int[]{1, 2, 3};

        findCombination(nums, target, 0, 0);
        System.out.println("Possible Combinations:");
        for (int n : ways) {
            int powerOfTen = 0;
            while (n != 0) {
                for (int x = 0; x < n % 10; x++) {
                    if (powerOfTen == 0) System.out.print("1 ");
                    if (powerOfTen == 1) System.out.print("2 ");
                    if (powerOfTen == 2) System.out.print("3 ");
                }
                n /= 10;
                powerOfTen++;
            }
            System.out.println();
        }
        System.out.println("There are " + ways.size() + " ways to reach " + target);
    }
}
