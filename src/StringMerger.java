public class StringMerger {
    public static boolean isMerge(String s, String part1, String part2) {
        for (char c : s.toCharArray()) {
            if (part1.contains("" + c)) part1 = part1.substring(part1.indexOf(c) + 1, part1.length());
            else if (part2.contains("" + c)) part2 = part2.substring(part2.indexOf(c) + 1, part2.length());
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isMerge("Going bananas!", "oin nana", "Ggbas!"));
    }

}