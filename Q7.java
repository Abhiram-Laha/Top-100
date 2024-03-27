//Prime number

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter : ");
        int n= scan.nextInt();

        if(prime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

        scan.close();

    }

    public static boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}



