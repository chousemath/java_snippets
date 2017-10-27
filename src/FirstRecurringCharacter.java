import java.util.Hashtable;

public class FirstRecurringCharacter {
    static char findRecurring(String str) {
        Hashtable<Character, Integer> charTable = new Hashtable<>();
        for (char c : str.toCharArray()) {
            if (charTable.containsKey(c)) return c;
            else charTable.put(c, 1);
        }
        return '!';
    }

    static void assessSuccess(char c) {
        if (c == '!') System.out.println("No recurring characters");
        else System.out.println("The first recurring character is " + c);
    }

    public static void main(String[] args) {
        String test1 = "ABCDEFGABFF";
        String test2 = "MNDJSENMNMNMD";
        assessSuccess(findRecurring(test2));
    }
}
