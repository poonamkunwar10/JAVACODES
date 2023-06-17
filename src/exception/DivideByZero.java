package exception;
public class DivideByZero {
    public static void main(String[] args) {
        int a,b,c;
        a=6;
        b=0;
        try{
            c= a/b;
            System.out.println("Rest of code in try block");
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception ==>" +e.getMessage());
        }
        System.out.println("Value of a is: "+a);
        System.out.println("Value of b is: "+b);
    }
}
