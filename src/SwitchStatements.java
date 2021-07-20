public class SwitchStatements {
    public static void main(String args[]){
        int value =3;

        switch(value){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3: case 4: case 5:
                System.out.println("3,4,5");
                break;
            default:
                System.out.println("nothing");
                break;



        }

        char charval = 'D';

        switch(charval){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charval);
                break;
            default:
                System.out.println("NO");
                break;
        }

        String month = "JANUARY";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("HAN");
                break;
            default:
                System.out.println("O");



        }


    }
}
