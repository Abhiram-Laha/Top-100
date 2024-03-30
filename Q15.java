//Factorial of a number

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = scan.nextInt();

        int res=1;

        while(n>0){
            res*=n;
            n--;
        }

        System.out.println("Result : "+res);
    }
}
