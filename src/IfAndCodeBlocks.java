public class IfAndCodeBlocks {
    public static void main(String args[]){
        int score = 1;
        if(score>500){
            System.out.println("Score less 500");
        } else if(score<100){
            System.out.println("Les than 100");
            int test = 10;
        } else{
            System.out.println("Got here");
        }
        //cannot use test outside of the code block of the else if
    }
}
