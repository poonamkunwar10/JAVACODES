package allaboutobject;

import java.lang.*;
import java.util.*;

public class EqualandHashEg extends Object{
    String name;
    int roll;
    public  EqualandHashEg(String name, int roll){
        this.name= name;
        this.roll= roll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualandHashEg that = (EqualandHashEg) o;
        return roll == that.roll && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll);
    }

    public static void main(String[] args) {
        EqualandHashEg eh1 = new EqualandHashEg("PK",6);
        EqualandHashEg eh2 = new EqualandHashEg("PK",6);

        Set<EqualandHashEg> seh= new HashSet<>();
        seh.add(eh1);
        seh.add(eh2);

        System.out.println(seh);
    }
}
