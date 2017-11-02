import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LongestCommonSubsequence {
    public static String lcs(String x, String y) {
        // your code here
        String longer = x.length() > y.length() ? x : y;
        String shorter = x.length() < y.length() ? x : y;
        for (char c : longer.toCharArray()) {
            if (!shorter.contains("" + c)) {
                System.out.println("shorter does not contain " + c);
                int i = longer.indexOf(c);
                longer = longer.substring(0, i) + longer.substring(i + 1, longer.length());
            }
        }
        System.out.println("longer: " + longer);
        System.out.println("shorter: " + shorter);
        return longer;
    }

    public static void main(String[] args) {
        System.out.println(lcs("abcdef", "acf"));
    }
}
