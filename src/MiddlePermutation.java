import java.util.SortedSet;
import java.util.TreeSet;

class MiddlePermutation {
    private static SortedSet<String> permSet = new TreeSet<>();

    private static void permutation(String base) { permutation("", base); }
    private static void permutation(String prefix, String base) {
        int length = base.length();
        if (length == 0) permSet.add(prefix);
        for (int i = 0; i < length; i++) {
            permutation(prefix + base.charAt(i), base.substring(0, i) + base.substring(i + 1, length));
        }
    }

    public static String findMidPerm(String strng) {
        // your code here!
        permutation(strng);
//        System.out.println(permSet);
        int permSize = permSet.size();
        int i = permSize % 2 == 0 ? permSize/2 - 1 : permSize/2;
        return permSet.toArray()[i].toString();
    }

    public static void main(String[] args) {
        System.out.println(findMidPerm("abcdxg"));
    }
}