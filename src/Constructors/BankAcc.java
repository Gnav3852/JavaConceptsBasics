package Constructors;

import java.lang.reflect.AccessibleObject;

public class BankAcc {
    private int accNum;
    private double bal;
    private String name;
    private String email;
    private String phone;

    // no void, only the name of the class
    public BankAcc(){
        //uses another constuctor
        this(593,2.5,"Deg","Deg","Deg");
        System.out.println("EMpty");;
    }
    //you can overlead a constructor, wtih different amounts of parameters

    public BankAcc(int accNum, double bal, String name, String email, String phone){
        System.out.println("DONE");
        //can do some validation in the other functions
        //not nessacary
        setAccNum(accNum);
        this.bal=bal;
        this.name=name;
        this.email=email;
        this.phone=phone;

    }

    public BankAcc(String name, String email, String phone) {
        //default 2 params
        this(20,20,name,email,phone);
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(double amount){
        this.bal+= amount;
        System.out.println("Success");

    }

    public void withDraw(double amount){
        if((this.bal-amount)>=0){
            this.bal-= amount;
            System.out.println("Success");
        } else{
            System.out.println("-1");
        }
    }

}
