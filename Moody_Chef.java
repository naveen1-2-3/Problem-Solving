import java.util.Scanner;

class Moody_Chef {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            int currenthappiness = 0;
            int maxhappiness = 0;
            int minhappiness = 0;
            for (int i = 0; i < n; i++) {
                int sp = sc.nextInt();
                if (sp >= l && sp <= r) {
                    currenthappiness++;
                } else {
                    currenthappiness--;
                }
                maxhappiness = Math.max(maxhappiness, currenthappiness);
                minhappiness = Math.min(minhappiness, currenthappiness);
            }
            System.out.println(maxhappiness+" "+minhappiness);
        }
    }
}