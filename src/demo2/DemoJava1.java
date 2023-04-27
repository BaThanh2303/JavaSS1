package demo2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DemoJava1 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 Số từ bàn phím:");
        n = sc.nextInt();
        System.out.println("Số vừa Nhập:"+n);
        //Câu 1
   for(int j = 1;j <= n;j++){
        if(CheckSHH(n)){
            System.out.println(n + " Là số hoàn hảo");
        }else {
            System.out.println(n + " Không phải là số hoàn hảo");
        }return;
    }
        //Câu 2
        System.out.println(fibonacci(n) + " Là Số Theo vị trí trong fibonaci");
    }
    public static  boolean CheckSHH(int n){
        // Tạo biến Tổng
        int sum = 1;

        //Tạo Loop
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i==0)
            {
                if(i * i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;
            }
        }
        if (sum == n && n != 1)
            return true;

        return false;
    }
// Câu 2
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
