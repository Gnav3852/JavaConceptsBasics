package Interfaces;

public class Dekph implements ITele{
    private int myNum;
    private boolean isRing;

    public Dekph(int myNum) {
        this.myNum = myNum;
    }


    public void powerOn() {
        System.out.println("ON");
    }


    public void dial(int phoneNumber) {
        System.out.println("DEAILING " + phoneNumber);
    }

    public void awns() {
        if(isRing){
            System.out.println("AWNS");
            isRing = false;
        }
    }
}
