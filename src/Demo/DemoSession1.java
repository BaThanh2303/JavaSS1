package Demo;

import java.util.Scanner;

public class DemoSession1 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số Lượng Phần Tử:");
        n = sc.nextInt();
        int arrSNT[] = new int[n];
        for (int i = 0; i < arrSNT.length; i++) {

            arrSNT[i] = sc.nextInt();
        }
        for(int a: arrSNT) {
            if (checkSNT(a)) {
                System.out.println("SNT:" +a);
            }
        }
    }

        public static boolean checkSNT(int a){
            if(a < 2) return false;
            if(a < 4) return true;
            for(int i = 2; i <= a/2; i++){
                if (a % i == 0){
                    return false;
                }
            }
            return true;
        }
    }


