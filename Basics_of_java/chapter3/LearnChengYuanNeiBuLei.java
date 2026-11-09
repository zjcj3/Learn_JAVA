package Basics_of_java.chapter3;

//定义一个外部类
class Outer{
    //定义一个内部类
    public class Inner{
        public void show(){
            System.out.println("This is an inner class");
        }
    }
}

public class LearnChengYuanNeiBuLei {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner(); //通过外部类对象创建内部类对象
        inner.show();
    }
}
