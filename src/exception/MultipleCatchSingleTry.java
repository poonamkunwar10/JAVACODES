package exception;

public class MultipleCatchSingleTry {
    public static void main(String[] args) {
        try{
            int[] marks={60,40,33,44};
            System.out.println("Obtained theory marks: "+marks[5]);
        } catch (ArrayStoreException e) {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught exception "+e);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
