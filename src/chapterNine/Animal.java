package chapterNine;

public class Animal extends LivingThing{
    public Animal(int anything){
        System.out.println("I am creating animal");
    }
    @Override
    public void move(){
        //calling the father
        // super.move();
        System.out.println("Move like animal");
    }

}
