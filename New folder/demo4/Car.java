package demo4;

public class Car {
    private String brand;
    private double price;

    public final String madeIn = "VN";
    //class variable
    public static String type = "Car";
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
//        this.madeIn = "China"  - final set duy nhất 1 lần.
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price > 0?price:0;
//        if(price > 0){
//            this.price = price;
//        }else {
//            this.price = 0;
//        }
    }
    public final void run(){

    }
}
