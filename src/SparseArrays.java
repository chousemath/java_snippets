import java.util.Hashtable;
import java.util.Scanner;

public class SparseArrays {
    // There is a collection of N strings ( There can be multiple occurences of a particular string ).
    // Each string's length is no more than 20 characters. There are also Q queries.
    // For each query, you are given a string, and you need to find out how many times this string occurs in the
    // given collection of N strings.

    static Hashtable<String, Integer> strHash = new Hashtable<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = scanner.nextInt();
        for (int i = 0; i < numberOfInputs; i++) {
            String key = scanner.next();
            if (strHash.containsKey(key)) strHash.put(key, strHash.get(key) + 1);
            else strHash.put(key, 1);
        }
        int numberOfQueries = scanner.nextInt();
        String[] queryArr = new String[numberOfQueries];

        for (int i = 0; i < numberOfQueries; i++) queryArr[i] = scanner.next();

        scanner.close();

        for (String query : queryArr) {
            if (strHash.containsKey(query)) System.out.println(strHash.get(query));
            else System.out.println(0);
        }
    }
}
