package chapterNine;

public class Vertebrate extends Animal {
    public Vertebrate(int anything){
        super(anything);
        System.out.println("I am creatng vertebrates");
    }
    public void move(){
        System.out.println("Vertebrate dey move");
    }
}
