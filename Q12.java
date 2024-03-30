//Fibonacci Series upto nth term

import java.util.Arrays;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = scan.nextInt();

        // 0 1 1 2 3 5 8

        int a = 0;
        int b = 1;

        int[] arr = new int[n];
        arr[0]=a;
        arr[1]=b;
        int k=2;

        for(int i=0; i<n-2; i++){
            int sum = a+b;
            arr[k] = sum;
            a=b;
            b=sum;
            k++;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(n+"th term : "+arr[n-1]);
    }
}
