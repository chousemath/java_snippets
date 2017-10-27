import java.util.Hashtable;

public class FirstNonRecurringCharacter {
    static char findNonRecurring(String str) {
        Hashtable<Character, Boolean> recurringTable = new Hashtable<>();
        for (char c : str.toCharArray()) {
            // if key is found, recurring status for the character key is set to true
            if (recurringTable.containsKey(c)) recurringTable.put(c, true);
            else recurringTable.put(c, false);
        }
        for (char c : str.toCharArray()) {
            if (!recurringTable.get(c)) return c;
        }
        return '!';
    }

    static void assessSuccess(char c) {
        if (c == '!') System.out.println("No recurring characters");
        else System.out.println("The first recurring character is " + c);
    }

    public static void main(String[] args) {
        String str1 = "ABCDEFGABDEF"; // expect C
        String str2 = "LJSKDBFFFFF";
        assessSuccess(findNonRecurring(str1));
        assessSuccess(findNonRecurring(str2));
    }
}
