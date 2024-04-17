
/***problem link : https://www.codechef.com/problems/ANUUND */


import java.util.Arrays;
import java.util.Scanner;

public class UpsandDowns {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            int temp = 0;
            Arrays.sort(a);
            for (int i = 1; i < n - 1; i = i + 2) {
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
            
            
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
