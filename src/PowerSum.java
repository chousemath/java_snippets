import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PowerSum {

    static int powerComboCount = 0;

    public static void findPowerSums(List<Integer> powList, int counter, int target, int sum, int listSize) {
        if (counter == listSize) return;
        int currentValue = powList.get(counter);
        System.out.println("SEARCHING -> CurrentValue: " + currentValue + ", sum: " + sum + ", target: " + target);
        if (currentValue + sum == target) {
            System.out.println("CurrentValue: " + currentValue + ", sum: " + sum + ", target: " + target);
            powerComboCount++;
            return;
        } else {
            System.out.println(sum + " " + currentValue + " " + target);

            if (sum != 0) {
                findPowerSums(powList, counter + 1, target, sum + currentValue, listSize);
            }
            findPowerSums(powList, counter + 1, target, sum, listSize);
            findPowerSums(powList, counter + 1, target, currentValue, listSize);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int power = scanner.nextInt();
        scanner.close();
        int sum = 0;
        int counter = 1;
        List<Integer> powList = new ArrayList<>();
        for (int i = 0; Math.pow(i, power) <= target; i++) powList.add((int) Math.pow(i, power));
        for (int val : powList) System.out.println(val);
        findPowerSums(powList, counter, target, sum, powList.size());
        System.out.println(powerComboCount);
    }
}
