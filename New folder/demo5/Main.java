package demo5;

public class Main {
    public static void main(String[] args) {
        IMale im = new IMale() {
            @Override
            public void drink() {
                System.out.println("Drink Vodka");
            }
        };
        //up casting - down casting

        //lambda expression
        IMale im2 = () -> {
            System.out.println("Drink Beer");
        };
    }
}
