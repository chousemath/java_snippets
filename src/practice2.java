public class practice2 {
    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) return 1000 + playerScore;
        else if (playerScore >= 500 && playerScore <= 1000) return 500 + playerScore;
        else if (playerScore >= 100 && playerScore < 500) return 100 + playerScore;
        else return 0;

    }

    public static void main(String[] args) {
        String playerName = "Joseph";
        displayHighScorePosition(playerName, calculateHighScorePosition(1500));
        displayHighScorePosition(playerName, calculateHighScorePosition(900));
        displayHighScorePosition(playerName, calculateHighScorePosition(400));
        displayHighScorePosition(playerName, calculateHighScorePosition(50));
    }
}
