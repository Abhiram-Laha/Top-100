// Power of a number 

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Base & Expo : ");
        int base = scan.nextInt();
        int expo = scan.nextInt();

        double res = Math.pow(base, expo);

        System.out.println("Result : "+res);
    }
}
