//Positive or Negative numbe

import java.util.Scanner;

class Q1{
    public static void main(String args[]){
        //System.out.print("Hello");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = scan.nextInt();

        if(n<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Positive");
        }
    }
}