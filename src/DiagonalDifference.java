import java.util.Scanner;
public class DiagonalDifference {
    static int calculatePrimaryDiagonal(int[][] nbyn, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) sum += nbyn[i][i];
        return sum;
    }
    static int calculateSecondaryDiagonal(int[][] nbyn, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) sum += nbyn[i][n - i - 1];
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nbyn = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nbyn[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Math.abs(calculatePrimaryDiagonal(nbyn, n) - calculateSecondaryDiagonal(nbyn, n)));
    }
}
