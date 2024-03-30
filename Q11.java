//Armstrong number

import java.util.Scanner;

public class Q11{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = scan.nextInt();
        int temp=n;

        int sum = 0;

        while(n>0){
            int digit = n%10;
            sum+=digit*digit*digit;
            n/=10;
        }

        if(temp==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        scan.close();
    }
}