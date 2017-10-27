public class Xbonacci {

    static double[] tribonacci(double[] s, int n) {
        double[] resultArr = new double[n];
        if (n <= 3) {
            for (int i = 0; i < n; i++) {
                resultArr[i] = s[i];
            }
        } else {
            resultArr[0] = s[0];
            resultArr[1] = s[1];
            resultArr[2] = s[2];
            // if n == 0, then return an empty array and be ready for anything else which is not clearly specified ;)
            for (int i = 0; i <= n - 4; i++) resultArr[i+3] = nextTribNum(resultArr, i);
        }

        return resultArr;
    }

    static double nextTribNum(double[] resultArr, int index) {
        return resultArr[index] + resultArr[index + 1] + resultArr[index + 2];
    }

    public static void main(String[] args) {
        // you need to create a fibonacci function that given a signature array/list, returns the first n elements -
        // signature included of the so seeded sequence.

        // Signature will always contain 3 numbers;
        double[] testSignature1 = {1, 4, 7};
        double[] testSignature2 = {2, 3, 9};
        double[] testSignature3 = {4, 7, 8};
        double[] testSignature4 = {13.0, 15.0, 20.0};

        // n will always be a non-negative number;
        int testN1 = 8;
        int testN2 = 12;
        int testN3 = 20;
        int testN4 = 10;

        double[] resultArr1 = tribonacci(testSignature4, 0);
        for (double x : resultArr1) System.out.print(x + " -> ");
        System.out.println();
        System.out.println("-----------");
    }
}