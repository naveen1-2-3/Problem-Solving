
/**** Problem link :https://www.codechef.com/problems/ZCOSCH?tab=statement  ******/

import java.util.Scanner;

public class How_Much_Scholarship {
    public static void main(String[] args) {
        int r;
        Scanner sc=new Scanner(System.in);
        r = sc.nextInt();
        if (r >= 1 && r <= 50) {
            System.out.println(100);
        }
        else if (r > 50 && r <= 100) {
            System.out.println(50);
        }
        else {
            System.out.println(0);
        }
        
    }
}
