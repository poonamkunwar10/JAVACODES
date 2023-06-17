package basics;

public class AddDigitsOfNo {
    public static void main(String[] args) {
        int n, first, third, sum, firstdigit, thirdigit;
        n = 2080;
        first = n / 1000;
        firstdigit = first % 10;
        thirdigit = (n / 10) % 10;
        sum = firstdigit + thirdigit;

        System.out.println("First digit: " + firstdigit);
        System.out.println("Third digit: " + thirdigit);
        System.out.println("Sum of first and third digit is: " + sum);
    }
}