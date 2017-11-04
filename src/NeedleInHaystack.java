public class NeedleInHaystack {
    public static int strStr(String haystack, String needle) {
        if (needle == null || haystack == null) return -1;
        if (needle == "") return 0;
        if (haystack == "") return -1;

        if (haystack.equals(needle)) return 0;

        int needleLength = needle.length();
        int haystackLength = haystack.length();
        String newHaystack = haystack;
        char first = needle.charAt(0);
        while (newHaystack.contains("" + first)) {
            // get index of "first"
            int firstIndex = newHaystack.indexOf(first);
            // check for array out of bounds
            if (firstIndex + needleLength <= haystackLength) {
                String potential = newHaystack.substring(firstIndex, firstIndex + needleLength);
                if (potential.equals(needle)) return firstIndex;
                else newHaystack = newHaystack.substring(0, firstIndex) + "." + newHaystack.substring(firstIndex + 1, haystackLength - 1);
            } else newHaystack = newHaystack.substring(0, firstIndex) + "." + newHaystack.substring(firstIndex + 1, haystackLength - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack1 = "heybaby";
        String needle1 = "hey"; // 12
        System.out.println(strStr(haystack1, needle1));
    }
}
