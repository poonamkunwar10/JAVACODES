package basics;
import java.util.Scanner;
public class MyIntro {
    public static void main(String[] args) {
        Scanner info= new Scanner(System.in);

        System.out.println("Enter name: ");
        String name= info.nextLine();

        System.out.println("Enter age: ");
        Integer age= info.nextInt();

        info.nextLine();

        System.out.println("Enter address: ");
        String address= info.nextLine();

        System.out.println("Hello, my name is " +name +"!. I'm  "+age+ "I live in" +address);



    }
}
