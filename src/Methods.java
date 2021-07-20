public class Methods {


    public static void main(String args[]){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calcScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calcScore(true,10000,8,200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Tim",1500);
        displayHighScorePosition("Tim",900);
        displayHighScorePosition("Tim",400);
        displayHighScorePosition("Tim",50);
    }

    public static int calcScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            //after return goes back to main
            return finalScore;
        } else {
            return -1;
        }


    }

    public static void displayHighScorePosition(String name, int score){
        int pos = calcHighScorePos(score);
        System.out.println(name + " " + pos);
    }

    public static int calcHighScorePos(int score){
        if(score >=1000){
            return 1;
        } else if(score >= 500 && score <1000){
            return 2;
        } else if(score<500 && score >=100){
            return 3;
        } else{
            return 4;
        }
    }


}
