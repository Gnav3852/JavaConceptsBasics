package Composition;

public class Main {
    public static void main(String args[]){

        //either do new Resolution(20,20) or create a variable
        Monitor theMonitor = new Monitor("200","20",27,new Resolution(25,14));

        Motherboard motherboard = new Motherboard("20","A",4,2,"242");
        PC thePc = new PC(theMonitor,motherboard);

        //get monitor gets the obj
        //which has the functions

        thePc.powerUp();

    }
}
