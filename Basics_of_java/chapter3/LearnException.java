package Basics_of_java.chapter3;

public class LearnException {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
            //抛出异常后的代码不会执行
            System.out.println("Result: " + result);
        } 
        //捕获try中代码抛出的异常，参数是想要捕获的异常类型
        //从小到大捕获
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        //catch块可以有多个，捕获不同类型的异常
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        // finally块中的代码无论是否发生异常都会执行
        finally {
            System.out.println("This block is always executed.");
        }

        //throws关键字用于声明方法可能抛出的异常类型，调用该方法的代码必须处理这些异常
        try {
            LearnException obj = new LearnException();
            obj.test();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        //主动抛出异常
        try{
            throw new Exception("exception message.");
        }
        catch (Exception e) {
            throw new RuntimeException("This is a custom exception message.");
        }

        
    }

    public void test() throws Exception {
        throw new Exception("This is a test exception.");
    }
}
