import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = scan.nextInt();

        int sum=0;

        while(n>0){
            sum+=n;
            n--;
        }

        System.out.println("Sum : "+sum);
    }
}
