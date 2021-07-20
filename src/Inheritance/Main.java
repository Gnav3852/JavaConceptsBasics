package Inheritance;

public class Main {
    public static void main(String args[]){
        Animal animal = new Animal("A",1,1,4,3);
        Dog dog = new Dog("D",8,20,2,4,1,3,"Skilk");
        //inherit the functions of the parent
        dog.eat();
        dog.walk();
    }
}
