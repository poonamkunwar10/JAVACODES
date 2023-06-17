package constructor;
public class ConstructorInStatic {
    static int a;
    static {
        a=6;
        System.out.println("INSIDE STATIC BLOCK");
        System.out.println("a= "+a);
    }
    ConstructorInStatic(){
        System.out.println("INSIDE CONSTRUCTOR");
        a=10;
    }

    public static void func() {
        a=a+1;
        System.out.println("a= "+a);
    }

    public static void main(String[] args) {
        ConstructorInStatic cis= new ConstructorInStatic();
        cis.func();
    }
}
