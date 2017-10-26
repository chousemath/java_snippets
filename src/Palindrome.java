import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    // The first idea that comes to mind is to convert the number into string, and check if the string is a palindrome,
    // but this would require extra non-constant space for creating the string which is not allowed by the problem
    // description.
    static boolean isPalindrome(int x) {
        if (x < 0) return false;
        char[] charArr = Integer.toString(x).toCharArray();
        for (int i = 0; i < charArr.length / 2; i++) {
            if (charArr[i] != charArr[charArr.length - i - 1]) return false;
        }
        return true;
    }

    static boolean isPalindrome2(int x) {
        if (x < 0) return false;
        List<Integer> numList = new ArrayList<>();
        for (; x != 0; x /= 10) numList.add(x % 10);
        for (int i = 0; i < numList.size() / 2; i++) {
            if (numList.get(i) != numList.get(numList.size() - i - 1)) return false;
        }
        return true;
    }

    static boolean isPalindrome3(int x) {
        if (x < 0) return false;
        int reversed = 0;
        for (; x > reversed; x /= 10) reversed = 10 * reversed + x % 10;
        return x == reversed || x == reversed / 10;
    }

    public static void main(String[] args) {
        System.out.println("Hello from Palindrome!");
        int test1 = 12321;
        if (isPalindrome(test1)) System.out.println(test1 + " is a palindrome!");
        int test2 = 12345;
        if (isPalindrome(test2)) System.out.println(test2 + " is a palindrome!");
        if (isPalindrome2(test1)) System.out.println(test1 + " is a palindrome!");
        if (isPalindrome2(test2)) System.out.println(test2 + " is a palindrome!");
        if (isPalindrome3(test1)) System.out.println(test1 + " is a palindrome!");
        if (isPalindrome3(test2)) System.out.println(test2 + " is a palindrome!");
    }
}
