package InnerClasses;

import java.util.ArrayList;

public class GearBox {
    public ArrayList<Gear> gears;
    private int maxG;
    private  int currentGear = 0;
    private boolean clutchIsin;

    public GearBox(int maxG){
        this.maxG = maxG;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0,0);
    }


    public void operateCl(boolean in){
        this.clutchIsin = in;
    }
    
    public void addG(int num,double ratio){
        this.gears.add(new Gear(num,ratio));
    }

    public void changeG(int newG){
        if(newG < this.gears.size() && this.clutchIsin){
            this.currentGear = newG;
            System.out.println(newG);
        } else{
            System.out.println("fds");
        }
    }

    //inner class
    private class Gear{
        private int gearNum;
        private double ratio;

        public Gear(int gearNum, double ratio) {
            //the one def in the inner class
            this.gearNum = gearNum;
            this.ratio = ratio;
        }

        public  double driveSped(int revs){
            return  revs*(this.ratio);
        }

    }
}
