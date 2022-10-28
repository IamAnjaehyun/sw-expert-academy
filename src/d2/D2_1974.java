package d2;

import java.util.Scanner;

public class D2_1974 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int sdk[][] = new int[9][9];

        for (int tc = 1; tc <= T; tc++) {
            //판별값
            int answer = 1;
            for (int i = 0; i < 9; i++)
                for (int j = 0; j < 9; j++)
                    //스도쿠그리기
                    sdk[i][j] = sc.nextInt();

            //행열검사
            for (int i = 0; i < 9; i++) {
                int colSum = 0;
                int rowSum = 0;
                for (int j = 0; j < 9; j++) {
                    rowSum += sdk[i][j];
                    colSum += sdk[j][i];
                }
                if (colSum != 45 || rowSum != 45) {
                    answer = 0;
                    break;
                }
            }

            //중간에 판별
            if (answer == 0) {
                System.out.println("#" + tc + " 0");
                continue;
            }
            
            //정사각형
            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 9; j += 3) {
                    int sum = 0;
                    for (int x = 0; x < 3; x++)
                        for (int y = 0; y < 3; y++)
                            sum += sdk[i + x][j + y];
                    if (sum != 45) {
                        answer = 0;
                        break;
                    }
                }
                if (answer == 0) break;
            }
            System.out.println("#" + tc + " " + answer);
        }
        sc.close();
    }

}
