package Assignment;

public class Product {
    int id;
    String productName;
    int qty;
    int price;

    public Product(int id, String productName, int qty, int price) {
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }
    public void CheckQty(){
        if(this.qty > 0){
            System.out.println("Còn Hàng " + qty);
        }else {
            System.out.println("Hết Hàng");
        }
    }
}
