package Interfaces;

public class Main {
    public static void main(String[] args) {
        //there abstract methos

        // instead of ITele u could do Dekph

        //u can use ITele so i can be changed to another class of Itele
        //like timph = new MobilePh()
        //^^that would work if    \/      if it was Dekph timph then timph = new mobleph would not work
        //\/\/
        ITele timph;
        timph = new Dekph(1842);
        timph.powerOn();
    }
}
