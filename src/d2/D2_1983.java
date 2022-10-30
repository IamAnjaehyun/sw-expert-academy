package d2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class D2_1983 {
    public static void main(String args[]) throws Exception {
        String score[] = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int std = sc.nextInt(); //학생
            int stdNum = sc.nextInt(); //학생번호
            double stdScore = 0.0;
            double result[] = new double[std];

            for (int i = 0; i < 3; i++) {
                double sc1 = sc.nextInt() * 0.35;
                double sc2 = sc.nextInt() * 0.45;
                double sc3 = sc.nextInt() * 0.20;
                double sum = sc1 + sc2 + sc3;
                result[i] = sum;
                if (i + 1 == std) {
                    stdScore = sum;
                }
                Arrays.sort(result, Collections.reverseOrder());
                System.out.println(result[tc]);
            }
            System.out.println();
        }
    }
}
