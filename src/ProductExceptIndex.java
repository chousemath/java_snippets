import java.util.Hashtable;

public class ProductExceptIndex {
    static int getProductsOfAllIntsExceptAtIndex(int[] arr, int index) {
        Hashtable<Integer, Integer> valueMap = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) valueMap.put(i, arr[i]);
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Hello from ProductExceptIndex");
        int[] test1 = {1, 6, 3, -2, 4, 1};
        System.out.println(getProductsOfAllIntsExceptAtIndex(test1, 3)); // should be 72
    }
}
