// Greatest of the Three numbers

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int temp = a>b ? a:b;

        int res = temp>c ? temp:c;

        System.out.println("Greatest No. : "+res);

    }
}
