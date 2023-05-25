package demojava;

public class Main {
    public static void main(String args[]){
        int x = 10;
        Customer c = new Customer();
        Customer k = new Customer();
        c.setId(); = 100;
        k.setId(); = 90;
        System.out.println(c.setId());
        //thay vì dùng thẳng id thay bằng setId() aka Getter Setter
        c.buyCart();
        k.buyCart();
        c.sayHello("HaNoi");
        k.sayHello("SaiGon");
        c.printInfo();
        k.printInfo();
    }
}
