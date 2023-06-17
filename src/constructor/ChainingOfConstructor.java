package constructor;
public class ChainingOfConstructor {
    public ChainingOfConstructor() {
        this('H');
        System.out.println("Default constructor");
    }
    public ChainingOfConstructor(char p){
        this('R','P');
        System.out.println(p);
    }
    public ChainingOfConstructor(char p, char k)
    {
        System.out.println(String.valueOf(p)+ String.valueOf(k));
    }

    public static void main(String[] args) {

        new ChainingOfConstructor();
    }
}
