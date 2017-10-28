import java.util.Scanner;

public class LeftRotation {

    static int calculateShift(int arraySize, int shift, int originalPosition) {
        int newPosition = originalPosition - shift;
        while (newPosition < 0) newPosition += arraySize;
        return newPosition;
    }

    static int[] leftRotation(int[] a, int d) {
        int[] shiftedArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            shiftedArr[calculateShift(a.length, d, i)] = a[i];
        }
        return shiftedArr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
