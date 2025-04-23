public class GameResult {
    // This is a Challenge.
    public static void main(String[] args) {

    int highscorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("inte", highscorePosition);

    highscorePosition = calculateHighScorePosition(900);
    displayHighScorePosition("adri", highscorePosition);

    highscorePosition = calculateHighScorePosition(300);
    displayHighScorePosition("nooby", highscorePosition);

    highscorePosition = calculateHighScorePosition(90);
    displayHighScorePosition("hori", highscorePosition);

    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return  1;
        }
        else if (playerScore < 1000 && playerScore >= 500) {
            return  2;
        }
        else if (playerScore < 500 && playerScore >= 100) {
            return  3;
        }
        else {
            return  4;
        }
    }
    public static void displayHighScorePosition(String playerName, int highscorePosition){
        System.out.println(playerName + " managed to get into position "
                + highscorePosition + " on the highscore list.");
    }
}
