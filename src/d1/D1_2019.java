package d1;

import java.util.Scanner;

public class D1_2019 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int a = 1;
        for (int tc = 0; tc <= T; tc++) {
            System.out.print( a+" ");
            a *= 2;
        }
    }
}
