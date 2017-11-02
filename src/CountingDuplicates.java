import java.util.Hashtable;

// Write a function that will return the count of distinct
// case-insensitive alphabetic characters and numeric digits
// that occur more than once in the input string. The input
// string can be assumed to contain only alphabets
// (both uppercase and lowercase) and numeric digits.
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        Hashtable<Character, Integer> unique = new Hashtable<>();
        int total = 0;
        for (char c : text.toLowerCase().toCharArray()) {
            if (unique.containsKey(c)) {
                if (unique.get(c) == 1) {
                    total++;
                    unique.put(c, unique.get(c) + 1);
                }
            }
            else unique.put(c, 1);
        }
        return total;
    }

    public static void main(String[] args) {
//        System.out.println(duplicateCount("aA"));
//        System.out.println(duplicateCount("abcABC"));
        System.out.println(duplicateCount("indivisibility"));
    }
}