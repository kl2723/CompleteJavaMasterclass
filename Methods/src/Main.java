

public class Main {

    public static void main(String[] args) {

//       calculateScore(true, 800, 10, 300);
//       calculateScore(true, 10000, 8, 200);

       int highScorePosition=calculateHighPosition(750);
        displayHighScorePosition("Kymane", highScorePosition);

        highScorePosition=calculateHighPosition(1750);
        displayHighScorePosition("Kymane", highScorePosition);

        highScorePosition=calculateHighPosition(50);
        displayHighScorePosition("Kymane", highScorePosition);

        highScorePosition=calculateHighPosition(500);
        displayHighScorePosition("Kymane", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
            return -1;
    }


    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName+ " managed to get into position "+playerPosition+ " on the high score table");
    }

    public static int calculateHighPosition(int playerScore){
        if(playerScore>=1000){
            return 1;
        }else if(playerScore>=500&&playerScore<1000){
            return 2;
        }else if(playerScore>=100&&playerScore<500){
            return 3;
        }else{
            return 4;
        }
    }
}