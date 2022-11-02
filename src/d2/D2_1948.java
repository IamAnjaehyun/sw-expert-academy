package d2;

import java.util.Scanner;

public class D2_1948 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] day = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int tc = 1; tc <= T; tc++) {
            int m1 = sc.nextInt()-1;
            int d1 = sc.nextInt();
            int m2 = sc.nextInt()-1;
            int d2 = sc.nextInt();

            int firstSum = 0;
            int secondSum = 0;

            for(int i=0;i<m1;i++){
                firstSum += day[i];
            }
            firstSum += d1;

            for(int i=0;i<m2;i++){
                secondSum += day[i];
            }
            secondSum += d2;

            System.out.println("#" + tc + " " + (secondSum-firstSum+1));
        }
    }
}

/*
1/31, 2/28, 3/31, 4/30, 5/31, 6/30, 7/31, 8/31, 9/30, 10/31, 11/30, 12/31
 */