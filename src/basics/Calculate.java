package basics;

import java.util.Scanner;

//Java program that takes three numbers as input to calculate and print the average of the numbers.
public class Calculate {
    int a,b,c;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a=sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int b= sc.nextInt();

        System.out.println("Enter 3rd number: ");
        int c= sc.nextInt();

        int average= (a+b+c)/3;

        System.out.println("Average of the 3 numbers= "+average);
    }
}
