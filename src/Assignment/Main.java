package Assignment;

public class Main {
    public static void main(String[] args){
        Product prod1 = new Product(1,"Nuoc Hoa",2,2000);
        Product prod2 = new Product(2,"Ao Phong",0,500);
        prod1.CheckQty();
        prod2.CheckQty();
    }
}
