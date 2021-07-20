

public class PrimitiveTypes {
    public static void main(String[] args){

        int myVal = 10000;
        int myMinIntVal = Integer.MIN_VALUE;
        int myMaxIntVal = Integer.MAX_VALUE;
        System.out.println("Min " + myMinIntVal);
        System.out.println("Max " + myMaxIntVal);

        byte myMinByteVal = Byte.MIN_VALUE;
        byte myMaxByteVal = Byte.MAX_VALUE;
        System.out.println("Min " + myMinByteVal);
        System.out.println("Max " + myMaxByteVal);

        short myMiShortVal =Short.MIN_VALUE;
        short myMaShortVal =Short.MAX_VALUE;
        System.out.println("Min " + myMiShortVal);
        System.out.println("Max " + myMaShortVal);

        long myLongValue = 100L;
        long myMiLongVal =Long.MIN_VALUE;
        long myMaLongVal =Long.MAX_VALUE;
        System.out.println("Min " + myMiLongVal);
        System.out.println("Max " + myMaLongVal);

        byte myNewByNum = (byte)(myMinByteVal/2);

        byte byteNum = 20;
        short shortNum = 32;
        int intNum = 49;
        long longVal = 50000 + (10*(byteNum+shortNum+intNum));
        System.out.println(longVal);

        float myMiFloatVal =Float.MIN_VALUE;
        float myMaFloatVal =Float.MAX_VALUE;
        System.out.println("Min " + myMiFloatVal);
        System.out.println("Max " + myMaFloatVal);

        double myMiDoubleVal =Double.MIN_VALUE;
        double myMaDoubleVal =Double.MAX_VALUE;
        System.out.println("Min " + myMiDoubleVal);
        System.out.println("Max " + myMaDoubleVal);

        int myIntVal = 5/2 ;
        float myFloatVal = 5F/2;
        double myDoubleVal = 5D/2;
        System.out.println(myIntVal);
        System.out.println(myFloatVal);
        System.out.println(myDoubleVal);

        double pounds = 20;
        double poundsToKilo = pounds*0.453559237;
        System.out.println(poundsToKilo);

        char myChar = 'd';
        char myUni = '\u0044';

        boolean bool = true;





    }
}
