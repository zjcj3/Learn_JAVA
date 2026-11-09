package Basics_of_java.chapter3;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
    
    public String toString() {
        return "这是一个自定义异常";
    }
}

public class LearnCreateException {
    public static void main(String[] args) {
        LearnCreateException l = new LearnCreateException();
        try {
            l.test(-5);
        } catch (MyException e) {
            System.out.println("Caught exception: " + e);
        }
    }

    void test(int n) throws MyException {
        if(n<0){
            throw new MyException("n不能小于0");
        }
    }
}
