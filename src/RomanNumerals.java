import java.util.Arrays;
import java.util.Hashtable;

public class RomanNumerals {
    static int romanToInt(String s) {
        // create a hash table for all Roman numerals
        Hashtable<String, Integer> romanNumerals = new Hashtable<>();
        romanNumerals.put("I", 1);
        romanNumerals.put("II", 2);
        romanNumerals.put("III", 3);
        romanNumerals.put("IV", 4);
        romanNumerals.put("V", 5);
        romanNumerals.put("VI", 6);
        romanNumerals.put("VII", 7);
        romanNumerals.put("VIII", 8);
        romanNumerals.put("IX", 9);
        romanNumerals.put("X", 10);
        romanNumerals.put("XC", 90);
        romanNumerals.put("XL", 40);
        romanNumerals.put("L", 50);
        romanNumerals.put("C", 100);
        romanNumerals.put("CD", 400);
        romanNumerals.put("CM", 900);
        romanNumerals.put("D", 500);
        romanNumerals.put("M", 1000);

        char[] numerals = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < numerals.length; i++) {
            if (numerals[i] == 'X') {
                if (i + 1 >= numerals.length) sum += romanNumerals.get("X");
                else if (numerals[i+1] == 'C') {
                    sum += romanNumerals.get("XC");
                    i++;
                } else if (numerals[i+1] == 'L') {
                    sum += romanNumerals.get("XL");
                    i++;
                } else sum += romanNumerals.get("X");
            }
            else if (numerals[i] == 'L') sum += romanNumerals.get("L");
            else if (numerals[i] == 'C') {
                if (i + 1 >= numerals.length) sum += romanNumerals.get("C");
                else if (numerals[i+1] == 'D') {
                    sum += romanNumerals.get("CD");
                    i++;
                }
                else if (numerals[i+1] == 'M') {
                    sum += romanNumerals.get("CM");
                    i++;
                }
                else sum += romanNumerals.get("C");
            }
            else if (numerals[i] == 'D') sum += romanNumerals.get("D");
            else if (numerals[i] == 'M') sum += romanNumerals.get("M");
            else {
                String romanSubString = new String(Arrays.copyOfRange(numerals, i, numerals.length));
                sum += romanNumerals.get(romanSubString);
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Hello from Roman Numerals");
        System.out.println(romanToInt("MMMXLV"));
    }
}
