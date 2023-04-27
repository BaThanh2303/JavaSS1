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

        if(CheckSHH(n)){
            System.out.println(n + " Là số hoàn hảo");
        }else {
            System.out.println(n + " Không phải là số hoàn hảo");
        }return;
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
}
