//**********PROBLEM LINK****************//
//https://www.codechef.com/problems/ZOOZ//

import java.util.Scanner;

public class Zero_Ones_Equal_One_Zeros {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            // int x = n / 2;
            for (int i = 0; i < n; i++) {
                if ((n % 2) == 0) {
                    if (i == 0 || i == n - 1) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                } else {
                    if (i % 2 == 0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                }
            }
            System.out.println();
        }
    }
}
