package basics;

import java.util.Queue;
import java.util.Scanner;

public class ScannerEg {
    public static void main(String[] args) {
        Scanner org = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = org.nextInt();
        System.out.println("Enter your name:");
        String name= org.next();


        System.out.println(name);
        System.out.println(age);
    }
}
