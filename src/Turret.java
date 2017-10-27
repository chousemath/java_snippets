import java.util.Scanner;

public class Turret {
    public static void calculatePositions(int[][] trialArr) {
        for (int[] positions : trialArr) {
            int x1 = positions[0];
            int y1 = positions[1];
            int r1 = positions[2];
            int x2 = positions[3];
            int y2 = positions[4];
            int r2 = positions[5];

            double dist = distanceTwoPoints(x1, y1, x2, y2);

            if (x1 != x2 || y1 != y2 && r1 + r2 < dist) System.out.println(2);
            else if ((x1 != x2 || y1 != y2) && (r1 + r2) == dist) System.out.println(1);
            else if (x1 == x2 && y1 == y2 && r1 == 0 && r2 == 0) System.out.println(1);
            else if ((x1 != x2 || y1 != y2) && dist == Math.abs(r2 - r1)) System.out.println(1);
            else if (x1 == x2 && y1 == y2 && r1 == r2) System.out.println(-1);
            else System.out.println(0);
        }
    }

    public static double distanceTwoPoints(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int trials = scanner.nextInt();
        int[][] trialArr = new int[trials][6];
        for (int i = 0; i < trials; i++) {
            for (int j = 0; j < 6; j++) {
                trialArr[i][j] = scanner.nextInt();
            }
        }
        calculatePositions(trialArr);
    }
}
