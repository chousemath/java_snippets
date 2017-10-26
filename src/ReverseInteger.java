public class ReverseInteger {
    // In Java, a static member is a member of a class that isn’t associated with an instance of a class.
    // Instead, the member belongs to the class itself.
    // As a result, you can access the static member without first creating a class instance.
    static int reverseStupid(int x) {
        long longX = (long) x;
        boolean isNegative = longX < 0;
        longX = isNegative ? -longX : longX;
        // declare new array of size of numStr
        char[] originalArr = Long.toString(longX).toCharArray();
        // declare a new reversed character array
        String reversedStr = "";
        for (int i = 0; i < originalArr.length; i++) {
            reversedStr += originalArr[originalArr.length - i - 1];
        }
        long resp = isNegative ? -Long.parseLong(reversedStr) : Long.parseLong(reversedStr);
        return resp > Integer.MAX_VALUE || resp < Integer.MIN_VALUE ? 0 : (int) resp;
    }

    static int reverse(int x) {
        long res = 0;
        for (; x != 0; x /= 10) {
            res = res * 10 + x % 10;
        }
        return res < Integer.MIN_VALUE || res > Integer.MAX_VALUE ? 0 : (int) res;
    }

    public static void main(String[] args) {
        System.out.println("Hello from ReverseInteger!");
        System.out.println(reverseStupid(-123));
        System.out.println(reverse(123456789));
    }
}
