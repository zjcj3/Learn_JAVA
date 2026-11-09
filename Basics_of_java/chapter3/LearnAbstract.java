package Basics_of_java.chapter3;

abstract class absAnimal {
    abstract void eat();
}

class Dog extends absAnimal {
    @Override
    void eat() {
        System.out.println("狗吃骨头");
    }
}

public class LearnAbstract {
    public static void main(String[] args) {
        absAnimal dog = new Dog();
        dog.eat();
    }
}
