import java.util.Arrays;

public class HighestProductOfThree {
    public static int highestProductOfThree(int[] arr) {
        Arrays.sort(arr);
        int a = arr[0] * arr[1] * arr[arr.length-1];
        int b = arr[arr.length-1] * arr[arr.length-2] * arr[arr.length-3];
        int max = a > b ? a : b;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(highestProductOfThree(new int[]{-100, -50, 0, 1, 2, 3, 4}));
    }
}
