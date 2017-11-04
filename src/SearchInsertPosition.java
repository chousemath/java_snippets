public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        if (target > nums[high]) return nums.length;
        if (target < nums[low]) return 0;
        int checkValue;
        int halfIndex;
        while (low <= high) {
            halfIndex = low + (high - low) / 2;
            checkValue = nums[halfIndex];
            if (target == checkValue) return halfIndex;
            else if (target < checkValue) high = halfIndex - 1;
            else low = halfIndex + 1;

        }
        if (target < nums[low]) return low;
        else return low + 1;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 2, 5}, -1));
    }
}
