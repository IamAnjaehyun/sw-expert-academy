package d2;

import java.util.Arrays;
import java.util.Scanner;

public class D2_1983 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int std = sc.nextInt();
        int num = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            for (int o = 0; o < std; o++) {
                double rank[] = new double[o];
                double sum = 0;
                for (int i = 0; i < 3; i++) {
                    double a = sc.nextInt() * 0.35;
                    double b = sc.nextInt() * 0.45;
                    double c = sc.nextInt() * 0.20;
                    sum = a + b + c;
                    rank[o] = sum;

                }
                System.out.println("rank" + o + " = " + rank[o]);
                Arrays.sort(rank);
            }
            System.out.println();
        }
    }
}
