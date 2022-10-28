package d2;

import java.util.Scanner;

public class D2_1970 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        int money[] = {50000,10000,5000,1000,500,100,50,10};

        for (int tc = 0; tc < T; tc++) {
            int count[] = new int[money.length];
            int fullMoney = sc.nextInt();
            for(int i=0; i<money.length;i++){
                count[i] = fullMoney / money[i];
                fullMoney %= money[i];
            }

            System.out.println("#"+(tc+1));

            for(int i=0; i<money.length;i++){
                System.out.print(count[i] + " ");
            }
            System.out.println();

        }
    }
}
