package constructor;
class Box{
    double width, height, depth;
    Box(double w, double h, double d){
            width=w;
            height=h;
            depth=d;
        }
    // constructor used when no dimensions specified
        Box() {
                width=height=depth=0;
            }
    // constructor used when cube is created
    Box(double len)
    {
        width = height = depth = len;
    }
        double volume(){
        return width*height*depth;
    }
}
public class ConstOverloading {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 22, 17);
        Box myBox2 = new Box();
        Box myCube = new Box(6);
        double vol;

        vol= myBox1.volume();
        System.out.println("Volume of myBox1 is: "+vol);
        vol= myBox2.volume();
        System.out.println("Volume of myBox2 is: "+vol);
        vol=myCube.volume();
        System.out.println("Volume of cube is: "+vol);

    }
}
