public class OverLoading {
    public static void main(String args[]){
        calcScore("TIm",20);
        calcScore(20);

    }

    public static int calcScore(String name, int score){
        System.out.println(name+ score);
        return score*1000;
    }
    //change signature
    //amout of parameters
    public static int calcScore(int score){
        System.out.println(score);
        return score*1000;
    }
}
