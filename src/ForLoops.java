public class ForLoops {
    public static void main(String[] args){
//        for(int i=2; i<9; i++){
//            System.out.println(calcInterest(10000,i));
//        }
//        for(int i=8; i>1; i--){
//            System.out.println(calcInterest(10000,i));
//        }
        int numPrime=0;
        for(int i =1; i<20;i++){
            if(isPrime(i)){
                numPrime++;
                System.out.println(i);
                if(numPrime==3){
                    break;
                }

            } else{
                System.out.println("no");
            }
        }
    }



    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static double calcInterest(double amount, double interestRate){
        return(amount*(interestRate/100));
    }
}
