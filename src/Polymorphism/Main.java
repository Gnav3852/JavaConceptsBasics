package Polymorphism;


class Movie{
    private  String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends  Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "SHORk";
    }

}

class IndeDay extends Movie{
    public IndeDay(){
        super("Inde daty");
    }

    @Override
    public String plot() {
        return "Aluien";
    }
}

class ForgetableMovie extends  Movie{
    public ForgetableMovie(){
        super("Forgetale");
    }
}



public class Main {
    public static void main(String args[]){
        for(int i=1;i<11;i++){
            Movie movie = randommoive();
            if(movie == null){
                continue;
            }
            System.out.println(movie.getName());
            //has it got a plot method?

            System.out.println(movie.plot());
            System.out.println("|||||||||");
        }
    }



    public static Movie randommoive(){
        int randomNum = (int) (Math.random()*5);
//        System.out.println(randomNum);
        switch (randomNum){
            case 1:
                return new Jaws();
                //return anyways break it
            case 2:
                return new IndeDay();
            case 3:
                return new ForgetableMovie();
        }

        return null;
    }

}




