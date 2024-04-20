// problem link : https://www.codechef.com/problems/ADJSUMPAR?tab=statement

import java.util.Scanner;

public class Adjacent_Sum_Parity {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int b[] = new int[n];
            int c = 0;
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                if (b[i] == 1) {
                    c++;
                }
            }
            if (c % 2 == 0) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }

        }
    }
}
