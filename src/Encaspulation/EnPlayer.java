package Encaspulation;

public class EnPlayer {
    private String name;
    //def value of 100
    private int hitPoints = 100;
    private String weapon;

    public EnPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health>0 && health<=100){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int dmg){
        this.hitPoints -=dmg;
        if(this.hitPoints <=0){
            System.out.println("GG");
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
