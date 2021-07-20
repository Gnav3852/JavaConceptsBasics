import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birth");
        int birth= scanner.nextInt();

        //so no bug
        String fill = scanner.nextLine();


        System.out.println("name: ");
        String name = scanner.nextLine();

        int age = 2021-birth;

        System.out.println("Age: "+ age);
        System.out.println("Welcome " + name);

        scanner.close();
    }

}
