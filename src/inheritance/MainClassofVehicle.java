package inheritance;

public class MainClassofVehicle {
    public static void main(String[] args) {
        Thar thar= new Thar("THAR",3, false );
        thar.move(40,0);
        thar.accelerate(60);
        System.out.println("Current Speed: " +thar.getCurrentSpeed());

    }


}
