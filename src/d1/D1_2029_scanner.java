package d1;

import java.util.Scanner;

public class D1_2029_scanner {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int i,j;

        for (int tc = 1; tc <= T; tc++) {
            i=sc.nextInt();
            j=sc.nextInt();
            System.out.println("#"+tc+" "+ (i/j) + " " +(i%j));
        }
    }
}
