package LinkedLists;

public class Main {
    public static void main(String args[]){
        Costomer costomer = new Costomer("30m",40.5);
        Costomer anothercos;
        anothercos = costomer;
        //referancing the same object
        anothercos.setBal(204);
        System.out.println(costomer.getBal());




    }
}
