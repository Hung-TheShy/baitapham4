
package baitapveham4;

import java.util.Scanner;
public class Baitapveham4 {
public static int  trave(int a, int b ){
          int nghiem;
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
                return 0;
            } else {
                System.out.println("Phương trình vô nghiệm.");
                return 0;
            }
        } else {
            nghiem = -b / a;   
            System.out.println("Phương trình có nghiệm x = " + nghiem + ".");
            return nghiem;
        }
    }
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào số a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        int b = scanner.nextInt();
    System.out.println(trave(a,b));
}
}