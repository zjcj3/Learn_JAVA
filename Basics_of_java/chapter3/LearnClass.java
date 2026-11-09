package Basics_of_java.chapter3;

class Student{
        protected String name;
        int age;

        public Student(){}

        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        //对象作为参数的构造器
        public Student(Student student){
            this.name = student.name;
            this.age = student.age;
        }

        //拷贝构造器
        public Student(Student student, String name, int age){
            this.name = name;
            this.age = age;
        }

        

        //方法
        public void print(){
            System.out.println(name+", "+age);
        }

    }

public class LearnClass {
    // String name;
    // int age;

    // //方法
    // public void print(){
    //     System.out.println(name+", "+age);
    // }

    public static void main(String[] args) {
        Student student = new Student();
        student.print();
    }
}
