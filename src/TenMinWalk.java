// You live in the city of Cartesia where all roads are laid out in a perfect grid.
// You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk.
// The city provides its citizens with a Walk Generating App on their phones --
// everytime you press the button it sends you an array of one-letter strings representing directions to walk
// (eg. ['n', 's', 'w', 'e']).
// You know it takes you one minute to traverse one city block, so create a function that will return true
// if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will,
// of course, return you to your starting point. Return false otherwise.

import java.util.Hashtable;

public class TenMinWalk {
    private static Hashtable<Character, Integer> directions = new Hashtable<Character, Integer>() {{
        put('n', 1);
        put('e', 1);
        put('s', -1);
        put('w', -1);
    }};
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;
        int sum = 0;
        for (char c : walk) sum += directions.get(c);
        return sum == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid(new char[] {'s', 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n'}));
        System.out.println(isValid(new char[] {'n', 'n', 'e', 'e', 'e', 'w', 'e'}));
        System.out.println(isValid(new char[] {'n', 'n', 'e', 'e', 'e', 'e'}));
        System.out.println(isValid(new char[] {'s', 'n', 's', 'n', 'e', 'e'}));
        System.out.println(isValid(new char[] {'s', 'n'}));
        System.out.println(isValid(new char[] {'s', 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n'}));
    }
}