import java.util.Arrays;

public class ProductsOfAllExcept {
    public static int[] getProductsOfAllIntsExceptAtIndex(int[] inputArr) {
        int length = inputArr.length;
        int[] prodArr = new int[length];
        int temp;
        for (int i = 0; i < length; i++) {
            temp = inputArr[i];
            inputArr[i] = 1;
            prodArr[i] = Arrays.stream(inputArr).reduce(1, (a, b) -> a * b);
            inputArr[i] = temp;
        }
        return prodArr;
    }
    public static void main(String[] args) {
        for (int i : getProductsOfAllIntsExceptAtIndex(new int[]{1, 7, 3, 4})) System.out.println(i);
    }
}
