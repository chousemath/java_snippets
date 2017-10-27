import java.util.Scanner;

public class Hourglass {
    static void maxHourglassSum(int[][] inputArr) {
        int sum = Integer.MIN_VALUE;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int potential = inputArr[row][col] + inputArr[row][col+1] + inputArr[row][col+2] + inputArr[row+1][col+1] + inputArr[row+2][col] + inputArr[row+2][col+1] + inputArr[row+2][col+2];
                sum = sum > potential ? sum : potential;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        maxHourglassSum(arr);
    }
}
