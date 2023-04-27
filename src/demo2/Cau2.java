package demo2;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 Số từ bàn phím:");
        n = sc.nextInt();
        System.out.println("Số vừa Nhập:"+n);
        System.out.println(fibonacci(n) + " Là Số Theo vị trí trong fibonaci");
    }
    public static int fibonacci(int n) {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
