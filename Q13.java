// Factors of a number

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = scan.nextInt();

        System.out.print("Factors : ");
        for(int i=2; i<n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
