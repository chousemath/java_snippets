import java.util.Arrays;

public class CalculateAverage {
    public static double find_average(int[] array){
        return Arrays.stream(array).sum() / ((float) array.length);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7};
        System.out.println(find_average(arr));
    }
}
