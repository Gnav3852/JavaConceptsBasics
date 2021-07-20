public class OperatorsAndIfStatments {
    public static void main(String args[]){
        int num = 20;
        //num+1
        num++;
        //adds 2
        num+=2;
        //x10
        num*=10;

        boolean isAlien = false;
        if(isAlien==false) {
            System.out.println("No");
        }
        //==
        //!=
        //>=
        //<=
        //>
        //<
        int topScore = 80;
        int secTop = 60;
        if((topScore>secTop) && (topScore < 100)){
            System.out.println("sssss");
        }
        //and &&
        //or ||
        if((topScore>90) || (secTop <= 90)){
            System.out.println("zzzzz");
        }

        if(topScore ==20){
            System.out.println("Need double ==");
        }

        boolean isCar = true;
        if(!isCar){
            System.out.println("TRUE");
        }

        boolean wasCar = isCar ? true : false;
        //^^^ if isCar is true then true else false

        double numOne = 20.00;
        double numTwo = 80.00;
        double numThree = (numOne+numTwo)*100.00;
        boolean isNotRemainder = (numThree%40.00==0) ? true : false;
        System.out.println(isNotRemainder);
        if(!isNotRemainder){
            System.out.println("remainder");
        }


    }
}
