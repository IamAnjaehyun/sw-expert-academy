package d2;

import java.util.Scanner;

public class D2_1946 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            System.out.println("#"+tc);
            int time = sc.nextInt();
            String strAll = "";
            for (int i = 0; i < time; i++) {
                String str = sc.next();
                int num = sc.nextInt();
                for(int j=0;j<num;j++){
                    strAll += str;
                }
            }
            for(int i=0; i<strAll.length();i++){
                System.out.print(strAll.charAt(i));
                if(i != 0 && i % 10 == 9){
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}

/*
1
3
A 10
B 7
C 5
 */