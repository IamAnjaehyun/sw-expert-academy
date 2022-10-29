package d2;

import java.util.Scanner;


/*
10
5 2
1 3 3 6 7
8 13 9 12 8
4 16 11 12 6
2 4 1 23 2
9 13 4 7 3
 */
public class D2_2001 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int size = sc.nextInt();
            int pa = sc.nextInt();
            int pari[][] = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    pari[i][j] = sc.nextInt();
                }
            }
            int max = 0;
            int sum = 0;
            for (int i = 0; i < size - pa + 1; i++) {
                for (int j = 0; j < size - pa + 1; j++) {
                    sum = 0;
                    for (int k = 0; k < pa; k++) {
                        for (int l = 0; l < pa; l++) {
                            sum += pari[i + k][j + l];
                        }
                        if (max < sum) max = sum;
                    }
                }
            }
            System.out.println("#" + tc + " " + max);
        }

    }

}

