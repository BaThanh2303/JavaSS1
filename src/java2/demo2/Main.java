package java2.demo2;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Main {
    public static void main(String[] args) {
        Order<Integer> orderI = new Order<>();
        orderI.setCode(6);

        Order<String> orderS = new Order<>();
        orderS.setCode("XACX");

        orderS.sayHello("Xin Chao");
        orderS.sayHello(3.15);
    }
}
