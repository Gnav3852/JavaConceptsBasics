package classes;

public class Car {
    //default val is null
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String valMod = model.toLowerCase();
        if(valMod.equals("accord")) {
            this.model = model;
        } else{
            this.model = "xz";
        }
    }

    public String getModel(){
        return this.model;
    }



}
