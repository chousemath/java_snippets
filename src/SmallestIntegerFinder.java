public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int min = 0;

        for (int i = 0; i < args.length; i++) {
            if (min == 0) {
                min = args[i];
            } else {
                min = (min < args[i]) ? min : args[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println("Hello from SmallestIntegerFinder");
        int[] intArr1 = new int[3];
        intArr1[0] = 4;
        intArr1[1] = 7;
        intArr1[2] = 55;
        System.out.println(findSmallestInt(intArr1));
    }
}
