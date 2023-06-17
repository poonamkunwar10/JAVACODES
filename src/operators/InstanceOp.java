package operators;

public class InstanceOp {
    public InstanceOp(int a, int b) {

    }

    public static void main(String[] args) {
        InstanceOp io= new InstanceOp(10,6);
        String str = "INTERNSHIP";
        boolean result1;
        boolean result2;
    //checks if io is an instance of the Instanceop
        result2= io instanceof InstanceOp;
        System.out.println("Is io an object of main class?" +result2);

        // checks if str is an instance of the String.String cla
        result1 = str instanceof String;
        System.out.println("Is str an object of String.String? " + result1);

    }
}
