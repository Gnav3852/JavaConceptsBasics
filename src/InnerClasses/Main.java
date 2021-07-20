package InnerClasses;

public class Main {
    public static void main(String[] args) {
        //need to create a gearbox before creating a gear
        GearBox mc = new GearBox(6);

        mc.addG(1,3);
        mc.addG(2,2);
        mc.addG(3,5);
        mc.operateCl(true);
        mc.changeG(1);
        mc.operateCl(false);
        mc.changeG(1);
//        //inner class Gear
//        GearBox.Gear fist = mc.new Gear(1,23.2);
//        System.out.println(fist.driveSped(20));
        
    }
}
