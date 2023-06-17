package operators;

public class OpPrecedence {
    public static void main(String[] args) {
        int a=6,b=10, c=17;
        int result;
        result=a- ++c *++b;
        result=a- ++c *++b;
        System.out.println(result);
    }
}
