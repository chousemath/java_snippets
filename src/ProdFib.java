public class ProdFib { // must be public for codewars

    private static long[] fibArr = new long[3];

    private static long fib(long prevVal, long currVal, long target) {
        long product = prevVal * currVal;
        if (product == target) {
            fibArr[0] = prevVal;
            fibArr[1] = currVal;
            return 1;
        } else if (product > target) {
            fibArr[0] = prevVal;
            fibArr[1] = currVal;
            return 0;
        }
        return fib(currVal, prevVal + currVal, target);
    }

    public static long[] productFib(long prod) {
        fibArr[2] = fib(0, 1, prod);
        return fibArr;
    }

//    public static void main(String[] args) {
//        long[] answer1 = productFib(714);
//        System.out.println("[" + answer1[0] + ", " + answer1[1] + ", " + answer1[2] + "]");
//        answer1 = productFib(2);
//        System.out.println("[" + answer1[0] + ", " + answer1[1] + ", " + answer1[2] + "]");
//        answer1 = productFib(1);
//        System.out.println("[" + answer1[0] + ", " + answer1[1] + ", " + answer1[2] + "]");
//    }
}