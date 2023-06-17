package Abstract;
//updated code
//ABSTRACTION OF JAVA CLASS
abstract class Car{
    abstract void longdrive();
}
class Thar extends Car {
    @Override
    void longdrive() {
        System.out.println("Get ready for long drive!");
    }
}
class Bmw extends Car{
        @Override
        void longdrive() {
            System.out.println("Let's go!!!");
        }
    }
public class AbstractClass {
    public static void main(String[] args) {
        Thar obj1= new Thar();
        obj1.longdrive();

        Bmw obj2= new Bmw();
        obj2.longdrive();
    }
}
