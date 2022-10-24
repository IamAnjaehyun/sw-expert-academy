package d1;

import java.util.Scanner;

class D1_2071 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        float sum = 0;
        for (int tc = 1; tc <= T; tc++) {
            for (int i = 0; i < 10; i++) {
                sum += sc.nextInt();
            }
            System.out.printf("#%d %.0f\n", tc, sum/10);
            sum = 0;
        }
    }
}