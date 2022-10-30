package d2;

import java.util.*;

public class D2_1983 {
    static String score[] = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int tc = 0; tc < T; tc++) {
            int std = sc.nextInt(); //학생
            int stdNum = sc.nextInt(); //학생번호

            int stdScore = 0;
            int result[] = new int[std];

            for (int i = 0; i < std; i++) {
                int sc1 = sc.nextInt() * 35;
                int sc2 = sc.nextInt() * 45;
                int sc3 = sc.nextInt() * 20;
                int sum = sc1 + sc2 + sc3;
                result[i] = sum;
                if (i + 1 == stdNum) stdScore = sum;
            }
            Arrays.sort(result, Collections.reverseOrder());

            int index = 0;
            for (int i = 0; i < result.length; i++) {
                if (result[i] == stdScore) index = i;
            }
            index = index / (std / 10);

            System.out.printf("#%d %s\n", tc, score[index]);
        }

    }
}

