import com.sun.tools.javac.util.Convert;

import java.util.ArrayList;
import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int listSize = binary.size() - 1;
        int sum = 0;
        for (int i : binary) {
            sum += i * java.lang.Math.pow(2.0, listSize);
            listSize--;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> test1 = new ArrayList<>();
        test1.add(0);
        test1.add(1);
        test1.add(1);
        System.out.println("011 should be 3: " + ConvertBinaryArrayToInt(test1));
        List<Integer> test2 = new ArrayList<>();
        test2.add(1);
        test2.add(1);
        test2.add(1);
        test2.add(1);
        System.out.println("1111 should be 15: " + ConvertBinaryArrayToInt(test2));
    }
}
