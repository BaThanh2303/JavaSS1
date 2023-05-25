package demo6;

public class Main {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y=0;
            int z = x/y;
            System.out.println("z = "+z);
        }catch (ArithmeticException e){
            System.out.println("Math Error....");
        }
        catch (Exception e){
            System.out.println("Error...");
        }
        System.out.println("Done");
    }
}
