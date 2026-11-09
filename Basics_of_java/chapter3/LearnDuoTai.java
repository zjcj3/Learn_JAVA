package Basics_of_java.chapter3;

class Person{
    String name;
    public Person(String name){
        this.name = name;
    }
    public void print(){
        System.out.println("Peson name: " + name);
    }
}

class Student extends Person{
    public Student(String name){
        super(name);
    }

    public void print(){
        System.out.println("Student name: " + name);
    }
}

public class LearnDuoTai {
    public static void main(String[] args) {
        Student student = new Student("Tom");
        student.print();

        Person p2 = new Person("Jerry");
        p2.print();

        System.out.println(student instanceof Student); //true
        System.out.println(student instanceof Person); //true
        System.out.println(student instanceof Object); //true

        System.out.println(p2 instanceof Student); //false
        System.out.println(p2 instanceof Person); //true
        System.out.println(p2 instanceof Object); //true
    }
}
