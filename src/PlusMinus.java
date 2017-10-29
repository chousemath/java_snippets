import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            intList.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println(intList.stream().filter(x -> x > 0).collect(Collectors.toList()).size() / (float) n);
        System.out.println(intList.stream().filter(x -> x < 0).collect(Collectors.toList()).size() / (float) n);
        System.out.println(intList.stream().filter(x -> x == 0).collect(Collectors.toList()).size() / (float) n);
    }
}
