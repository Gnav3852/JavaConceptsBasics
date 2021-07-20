import java.util.Arrays;

public class RefTypeValType {
    public static void main(String[] args){
        //val types
        // each var has memory allocated
        int val = 10;
        int val2 = val;

        System.out.println(val2);
        System.out.println(val);

        val2++;
        val++;


        System.out.println(val2);
        System.out.println(val);

        //ref type
        //referance to the obj
        //address


        //referancing the new object
        //both change at the same time
        int[] arr = new int[5];
        int[] arr2 = arr;
        int[] arr3 = arr2;




        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));


        arr2[0]=1;
        arr3[4]=4;

        System.out.println("dfasdfs");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("FDSF");

        //de referancing it
        //with new key word
        //create new array
        arr3 = new int[] {1,3,5,3,64,6};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }

}
