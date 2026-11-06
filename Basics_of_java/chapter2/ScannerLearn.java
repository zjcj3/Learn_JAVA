package Basics_of_java.chapter2;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerLearn {
    public static void main(String[] args) {
        // Code for learning Scanner will go here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Scanner something:");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);
        scanner.close();

        Arrays.sort(new int[]{1, 2, 3, 4, 5});
        //打印
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}