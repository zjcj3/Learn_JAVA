package Basics_of_java.chapter2;

public class ChengFaBiao {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.err.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.err.println();
        }
    }
}
