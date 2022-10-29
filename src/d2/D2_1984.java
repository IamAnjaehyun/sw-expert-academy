package d2;

import java.util.Arrays;
import java.util.Scanner;

//나눈 값은 double 형이니까 double 로 선언~!

public class D2_1984 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int[] arr = new int[10];
            double sum = 0;
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int j=1;j<9;j++){
                sum += arr[j];
            }
            sum /= 8;
            System.out.println("#"+tc+" "+Math.round(sum));
        }
    }
}
