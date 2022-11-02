package d2;

import java.util.Scanner;

public class D2_1284 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
        int liter1 = sc.nextInt();
        int literR = sc.nextInt();
        int R = sc.nextInt();
        int overR = sc.nextInt();
        int useWater = sc.nextInt();

        int A = liter1*useWater;
        int B = 0;
        if(useWater > R){
            B = literR + (useWater-R)*overR;
//            System.out.println(B);
        }else{
            B = literR;
        }

        if(A>B) System.out.println("#"+tc+" "+B);
        else System.out.println("#"+tc+" "+A);
        }
    }
}

/*
2
9 100 20 3 10
8 300 100 10 250
1리터당 요금 / R리터 이하 요금 / R리터 기준 / R리터 초과시 리터당 / 1달 사용하는 물
 */
