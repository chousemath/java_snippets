import java.util.Arrays;

public class CountSheep {
    static int countSheeps(Boolean[] arrayOfSheeps) {
        int sheepCount = 0;
        for (Boolean sheep : arrayOfSheeps){
            if (sheep == null) continue;
            if (sheep) sheepCount++;
        }
        return sheepCount;
    }

    static int countSheepsAgain(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(b -> b != null && b).count();
    }

    public static void main(String[] args) {
        System.out.println("Hello from CountSheep");
        Boolean[] arrayOfSheeps = {true, true, null};
        System.out.println("There are " + countSheeps(arrayOfSheeps) + " sheep");
        System.out.println("There are " + countSheepsAgain(arrayOfSheeps));
    }
}
