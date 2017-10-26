public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        int[] indexArr = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexArr[0] = i;
                    indexArr[1] = j;
                }
            }
        }
        return indexArr;
    }

    public static void main(String[] args) {
        System.out.println("Hello from TwoSum");
        int[] testArr = new int[4];
        testArr[0] = 3;
        testArr[1] = 1;
        testArr[2] = 7;
        testArr[3] = 8;
        int testTarget = 9;
        int[] resultArr = twoSum(testArr, testTarget);
        System.out.println("Indexes are " + resultArr[0] + " and " + resultArr[1]);
    }
}
