import java.util.Hashtable;

public class LongestCommonPrefix {
    // create hash table with all common prefixes, key=prefix, val=length of prefix
    static Hashtable<String, Integer> prefixHash = new Hashtable<String, Integer>(){{
        put("de", 2);
        put("if", 2);
        put("up", 2);
        put("im", 2);
        put("un", 2);
        put("in", 2);
        put("re", 2);
        put("ir", 2);
        put("dis", 3);
        put("mid", 3);
        put("pre", 3);
        put("sub", 3);
        put("pro", 3);
        put("mis", 3);
        put("out", 3);
        put("non", 3);
        put("anti", 4);
        put("auto", 4);
        put("over", 4);
        put("tele", 4);
        put("semi", 4);
        put("post", 4);
        put("down", 4);
        put("mega", 4);
        put("extra", 5);
        put("hyper", 5);
        put("super", 5);
        put("under", 5);
        put("trans", 5);
        put("ultra", 5);
        put("inter", 5);
    }};

    static Hashtable<String, Integer> hashMatch(String str) {
        String longestPrefix = "";
        int prefixLength = 0;
        for (String prefix : prefixHash.keySet()) {
            int tempPrefixLength = prefixHash.get(prefix);
            if (tempPrefixLength > str.length()) continue;
            if (prefix.equals(str.substring(0, tempPrefixLength).toLowerCase())) {
                longestPrefix = prefix;
                prefixLength = tempPrefixLength;
                break;
            }
        }
        Hashtable<String, Integer> respHash = new Hashtable<>();
        respHash.put(longestPrefix, prefixLength);
        return respHash;
    }

    static String longestCommonPrefix(String[] strs) {
        String longestPrefix = "";
        int prefixLength = 0;
        for (String str: strs) {
//            if (str.isEmpty() || str.length() < 2) continue;
            Hashtable<String, Integer> tempPrefixHash = hashMatch(str);
            for (String key : tempPrefixHash.keySet()) {
                if (tempPrefixHash.get(key) > prefixLength) {
                    longestPrefix = key;
                    prefixLength = tempPrefixHash.get(key);
                }
            }
        }
        return longestPrefix;
    }

    public static void main(String[] args) {
//        Hashtable<String, Integer> respHash1 = hashMatch("Interpark");
//        for (String key : respHash1.keySet()) System.out.println(key + ": " + respHash1.get(key));
        String[] test1 = {"", "posterior", "antisemitism", "inferior", "extracurricular"};
        System.out.println(longestCommonPrefix(test1));
    }
}
