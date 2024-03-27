import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter : ");
        int n= scan.nextInt();

        int rev = reverse(n,0);

        if (n==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    public static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        
        rev = rev*10 + n%10;

        return reverse(n/10, rev);
    }
}
