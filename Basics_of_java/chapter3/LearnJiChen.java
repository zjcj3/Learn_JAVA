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
public class LearnJiChen {
    public static void main(String[] args) {
        Student student = new Student("张三");
        student.print();

        Person person = new Person("李四");
        person.print();

        Person person1 = new Student("王五");
        person1.print();
    }
}
