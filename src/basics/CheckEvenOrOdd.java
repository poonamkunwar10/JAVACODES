package basics;

import java.util.Scanner;

//Java program to accept a number and check whether the number is even or not.
// Prints 1 if the number is even or 0 if odd.
public class CheckEvenOrOdd {
//TERNARY OPERATOR IS USED
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();

        int result= isEven(num)? 1:0;
        System.out.println(result);
    }
    public static boolean isEven(int num){

        return num%2==0;
    }
}

