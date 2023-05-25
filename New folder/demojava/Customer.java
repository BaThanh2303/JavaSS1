package demojava;

public class Customer {
    int code = 10;
    String name;
    int age;
     String address;

     public Customer(){
         // hàm khởi tạo - contructor, tên giống hệt tên lớp
         // không có kiểu dữ liệu trả về, tự động chạy khi tạo đôí tượng
         System.out.println("đã tạo ra 1 đối tượng Customer");
     }

    //getter setter
     public int getId(){
         return code;
     }
     public void setId(int id){
         this.code = id;
     }

     void buyCart(){

     }
     void sayHello(String msg){
         System.out.println("Hello "+ msg);
     }

     void printInfo(){
         System.out.println("Name: " + this.name);
         System.out.println("Age: " + this.age);
     }
}
