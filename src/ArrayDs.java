// Given an array, A, of n integers, print each element in reverse order as a single line of space-separated integers.

import java.util.Scanner;

public class ArrayDs {
    static String reversedString(int[] a) {
        String reversedStr = "";
        for (int i = a.length - 1; i >= 0; i--) reversedStr += a[i] + " ";
        return reversedStr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        System.out.println(reversedString(arr));
    }
}
