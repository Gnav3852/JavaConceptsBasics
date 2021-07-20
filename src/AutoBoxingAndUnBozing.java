import java.util.ArrayList;

public class AutoBoxingAndUnBozing {
    public static void main(String args[]){
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for(int i=0;i<10;i++){
            arrList.add(i);
        }
        for(int i=0;i<10;i++){
            System.out.println(arrList.get(i));
        }
    }
}
