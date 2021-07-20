package Inheritance;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight,int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }


    private void chew(){
        System.out.println("Chww");
    }

    //changes it from the parent
    //makes it own
    @Override
    public void eat() {
        chew();
        //dont need to have this
        super.eat();
    }

    public void walk(){
        System.out.println("waklk");
        //can do super.move
        // if you do super.move uses the move() in the Animal class
        //incase you want to override move so it will still work
        move(10);
    }
    public void run(){
        System.out.println("run");
        move(20);
    }

    private void moveLegs(int speed){
        System.out.println("legs");
    }

    @Override
    public void move(int speed) {
        System.out.println("dogmove");
        moveLegs(20);
        super.move(speed);
    }
}
