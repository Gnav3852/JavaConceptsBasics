import com.sun.security.jgss.GSSUtil;

public class WhileLoop {
    public static void main(String args[]){
        int count = 0;
        while (count !=5){
            System.out.println(count);
            count++;
        }

        count =0;
        do{
            System.out.println(count);
            count++;
        }while(count!=6);
    }
}
