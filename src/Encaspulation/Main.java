package Encaspulation;

public class Main {
    public static void main(String args[]){
//        //NO ENCASUPLATION
//        //NO MORE CONTROL FOR THE OBJ
//        Player player= new Player();
//        player.name = "G";
//        //forget to initalze some fields sometime
//        //need constructor
//        player.health = 20;
//        player.weapon = "SAe";
//
//        int dmg = 10;
//        player.loseHealth(dmg);
//        System.out.println(player.healthRem());


        //ENCAPULATION

        EnPlayer player= new EnPlayer("BOB",200,"WSAW");
        System.out.println(player.getHitPoints());
    }
}
