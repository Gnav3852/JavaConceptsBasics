package Encaspulation;

public class Player {
    //NO ENCASUPLATION
    public String name;
    public int health;
    public String weapon;

   public void loseHealth(int dmg){
       this.health -=dmg;
       if(this.health<=0){
           System.out.println("GG");
       }
   }

   public int healthRem(){
       return this.health;
   }


}
