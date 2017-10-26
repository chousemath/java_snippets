import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InvertValues {
    public static int[] invert(int[] intArr) {
        int[] reversedArr = new int[intArr.length];
        for (int i = 0; i < intArr.length; i++)
            reversedArr[i] = intArr[i] * -1;
        return reversedArr;
    }

    public static void main(String[] args) {
        System.out.println("Hello from InvertValues");
        int[] testArr = new int[3];
        testArr[0] = 1;
        testArr[1] = 2;
        testArr[2] = 3;
        int[] resultArr = invert(testArr);
        for (int x : resultArr)
            System.out.println(x);
        List<Integer> myIntegers = Arrays.asList(1, 2, 3);
        List<Integer> reversedIntegers = myIntegers.stream().map(i -> -1 * i).collect(Collectors.toList());
        System.out.println(reversedIntegers);

        int[] anotherArr = java.util.Arrays.stream(testArr).map(x -> -x).toArray();
        for (int i : anotherArr)
            System.out.println("Value : " + i);
    }
}
