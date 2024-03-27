// Reverse of a number

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter : ");
        int n= scan.nextInt();
        int temp=n;

        int rem,rev=0;

        // 002 -> 200

        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }

        int a =(int) Math.log10(temp) +1;
        int b =(int) Math.log10(rev) +1;
        System.out.println("Ori : "+a);
        System.out.println("rev : "+b);

        // for(int i=0; i<zeroes; i++)
        // {
        //     rev*=10;
        // }

        System.out.println("Reversed : "+rev);

        scan.close();   
    }
    
}
