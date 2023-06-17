package basics;

class Student {
    String name;
    int age;

    public void info(String name) {
        System.out.println(name);
    }
    public void info ( int age){
        System.out.println(age);
    }

    public void info (String name,int age){
        System.out.println(name + "" + age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student std = new Student();
        std.name = "Poonam";
        std.age = 22;

        std.info(std.name, std.age);

    }
}
