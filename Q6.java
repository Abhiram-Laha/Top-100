// Leap year or not

import java.util.Scanner;

public class Q6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();

        if( y%4==0 || y%100!=0 ){
            System.out.println("Leap");
        }
        else if(y%400==0){
            System.out.println("Leap");
        }
        else{
            System.out.println("Not Leap");
        }
    }
}