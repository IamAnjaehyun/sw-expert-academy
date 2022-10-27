package d1;

import java.util.Scanner;

public class D1_1933 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            if(T%tc==0){
                System.out.print(tc + " ");
            }
        }
    }
}
