package LinkedLists;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> plces = new LinkedList<String>();
        plces.add("SF");
        plces.add("FREMONT");
        plces.add("DUBLIN");
        plces.add("OKLAND");
        plces.add("LAKE T");

        prinList(plces);
        System.out.println("_____________");

        plces.add(1,"PLES");

        prinList(plces);
        System.out.println("_____________");

        plces.remove(4);

        prinList(plces);
        System.out.println("_____________");
    }


    private static void prinList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
