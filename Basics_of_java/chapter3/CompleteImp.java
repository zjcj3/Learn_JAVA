package Basics_of_java.chapter3;

public class CompleteImp implements LearnInterface, Imp1 {
    @Override
    public void eat() {
        System.out.println("Eating food");
    }
    
    public static void main(String[] args) {
        CompleteImp obj = new CompleteImp();
        obj.eat();
    }
}
