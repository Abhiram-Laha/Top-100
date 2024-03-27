// Sum of digits of a number

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter : ");
        int n= scan.nextInt();

        int sum=0;

        while(n>0){
            sum+=n%10;
            n/=10;
        }

        System.out.println("Sum : "+sum);
        scan.close();
    }
}
