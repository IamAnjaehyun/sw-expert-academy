package d2;

import java.util.Scanner;

public class D2_1926 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int num;
        for (int tc = 1; tc <= T; tc++) {
            num = tc;
            int a = num / 10;
            int b = num % 10;

            if (a == 3 || a == 6 || a == 9) {
                if (b == 3 || b == 6 || b == 9) {
                    System.out.print("-- ");
                    continue;
                }
                System.out.print("- ");
                continue;
            }

            if (b == 3 || b == 6 || b == 9) {
                System.out.print("- ");
                continue;
            }

            System.out.print(num + " ");

        }
    }
}
