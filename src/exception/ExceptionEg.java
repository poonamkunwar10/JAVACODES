package exception;

public class ExceptionEg {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[1]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

    }
}
