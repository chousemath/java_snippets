import java.util.Scanner;

public class FindThePoint {
    static void getReflectedPoint(int[][] pointArr, int rowNum) {
        for (int i = 0; i < rowNum; i++) {
            // calculate slope
            if (pointArr[i][0] == pointArr[i][2]) {
                int yDiff = pointArr[i][3] - pointArr[i][1];
                System.out.println(pointArr[i][0] + " " + (pointArr[i][3] + yDiff));
            } else {
                int xDiff = pointArr[i][2] - pointArr[i][0];
                double slope = (pointArr[i][3] - pointArr[i][1]) / (double) xDiff;
                double intercept = pointArr[i][1] - slope * pointArr[i][0];
                int newX = pointArr[i][2] + xDiff;
                int newY = (int) (slope * (pointArr[i][2] + xDiff) + intercept);
                System.out.println(newX + " " + newY);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rowNum = in.nextInt();
        int[][] pointArr = new int[rowNum][4];
        for (int i = 0; i < rowNum; i++) {
            pointArr[i][0] = in.nextInt();
            pointArr[i][1] = in.nextInt();
            pointArr[i][2] = in.nextInt();
            pointArr[i][3] = in.nextInt();
        }

        getReflectedPoint(pointArr, rowNum);
    }
}
