import java.util.Hashtable;

public class DuplicateEncoder {
    static String encode(String word){
        Hashtable<Character,Character> charHash = new Hashtable<>();
        for (char c : word.toCharArray()) {
            if (charHash.containsKey(c)) charHash.put(c, ')');
            else charHash.put(c, '(') ;
        }
        String newWord = "";
        for (char c : word.toCharArray()) {
            newWord += charHash.get(c);
        }
        return newWord;
    }

    public static void main(String[] args) {
        System.out.println("Hello from DuplicateEncoder");
        System.out.println(encode("ehello"));
    }
}