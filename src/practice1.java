public class practice1 {
    public static void main(String[] args) {
        int score = 10_000;
        int levelCompleted = 8;
        int bonus = 200;
        boolean gameOver = true;

        if (gameOver) {
            int finalScore = score + (levelCompleted + bonus);
            System.out.println("Your final score was " + finalScore);
        }

        int finalScore = score + (levelCompleted + bonus);
        System.out.println("Your final score was " + finalScore);
    }
}
