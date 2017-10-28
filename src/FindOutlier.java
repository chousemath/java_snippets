import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FindOutlier {
    static int find(int[] integers) {
        boolean isMostlyEven = Arrays.stream(integers).map(x -> Math.abs(x % 2)).sum() == 1;
        if (isMostlyEven) return Arrays.stream(integers).filter(x -> Math.abs(x)%2 == 1).boxed().collect(Collectors.toCollection(ArrayList::new)).get(0);
        else return Arrays.stream(integers).filter(x -> x%2 == 0).boxed().collect(Collectors.toCollection(ArrayList::new)).get(0);
    }

    public static void main(String[] args) {
        System.out.println("Hello from FindOutlier");
        int[] test1 = {1, 3, 5, 4, 9};
        int[] test2 = {2, 4, 3, 8, 10};
        int[] test3 = {160, 3, 1719, 19, 11, 13, -21};
        int[] test4 = {2, 4, 0, 100, 4, 11, 2602, 36};
        int[] test5 = {4, 6, 66, -3, 22};
        System.out.println(find(test1));
        System.out.println(find(test2));
        System.out.println(find(test3));
        System.out.println(find(test4));
        System.out.println(find(test5));
    }
}
