package Constructors;

public class Main {
    public static void main(String args[]){
        BankAcc bobAcc = new BankAcc(124,2300.4,"Jeff","8194Da","56u35");
        bobAcc.withDraw(100);
        bobAcc.deposit(50);
        bobAcc.deposit(200);
        bobAcc.withDraw(20);
        System.out.println(bobAcc.getEmail());

        BankAcc timAcc = new BankAcc("TIM","TIM","TIM");
        System.out.println(timAcc.getAccNum());
    }
}
