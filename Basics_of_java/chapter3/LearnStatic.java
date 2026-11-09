package Basics_of_java.chapter3;

public class LearnStatic {
    
    {
        System.out.println("匿名代码块");
    }

    static {
        System.out.println("静态代码块");
       
    }
    public LearnStatic(){
        System.out.println("构造方法");
    }
    public static void main(String[] args) {
        LearnStatic ls = new LearnStatic();
        System.out.println("--------------------");
        LearnStatic ls1 = new LearnStatic();
    }
}