//Sum of numbers in a given range

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Range : ");
        int n = scan.nextInt();
        int m=scan.nextInt();

        int sum=0;
        for(int i=n; i<=m; i++){
            sum+=i;
        }

        System.out.println("Sum : "+sum);
    }
}
