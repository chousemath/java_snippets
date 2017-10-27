import java.util.Scanner;

public class MaximumDraws {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTrials = scanner.nextInt();
        int[] sockPairs = new int[numberOfTrials];
        for (int i = 0; i < numberOfTrials; i++) sockPairs[i] = scanner.nextInt();
        for (int x : sockPairs) System.out.println(x + 1);
    }
}
