public class ParsingValFromString {
    public static void main(String[] args){
        //if numAsStr = 2018a will be an error in parsing
        String numAsStr = "2018";
        System.out.println(numAsStr+1);

        double dob = Double.parseDouble(numAsStr);
        int num = Integer.parseInt(numAsStr);

        System.out.println(num+1);
        System.out.println(dob+1);
    }
}
