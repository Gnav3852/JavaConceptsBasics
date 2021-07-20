import java.util.Scanner;

public class Arrays {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        int[] arr = getIntegers(5);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //get avg dadada

    }

    public static int[] getIntegers(int num){
        System.out.println(num);
        int[] values = new int[num];

        for(int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
//    public static void main(String args[]){
//        int VAR = 40;
//
//
//        double[] aar2 = new double[  23];
//
//
//
//        int[] arr = new int[25];
//        // OR ^^^^^ \/\/\/\/
////        int[] arr = {1,2,4,6,74,7,3,73,7,7};
//
//        for(int i=0;i<arr.length;i++){
//            arr[i] = i*10;
//        }
//
//        printArr(arr);
//
//
//    }
//
//    public static void printArr(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
}
