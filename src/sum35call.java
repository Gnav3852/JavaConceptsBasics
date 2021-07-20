public class sum35call {
    public static void main(String args[]){
        int sumNum = 0;
        int count = 0;
        for(int i=1; i<1001;i++){
            if(i%3 ==0 && i%5 ==0){
                sumNum+=i;
                count++;
                System.out.println(i);
                if(count==5){
                    System.out.println(sumNum);
                    break;
                }
            }
        }
    }
}
