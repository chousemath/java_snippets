import java.util.ArrayList;
import java.util.List;

public class Divisors {
    public static List<Integer> extractDivisors(int target) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= target; i++) {
            if (target % i == 0) divisors.add(i);
        }
        return divisors;
    }

    public static void main(String[] args) {
        String answer = "";
        for (int i : extractDivisors(20)) {
            answer = answer + i	+ " ";
        }
        System.out.println(answer.trim());
    }
}
