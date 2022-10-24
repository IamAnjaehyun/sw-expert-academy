package d1;

import java.util.Scanner;


//input
//        3
//        3 17 1 39 8 41 2 32 99 2
//        22 8 5 123 7 2 63 7 3 46
//        6 63 2 3 58 76 21 33 8 1
public class D1_2068 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int max = 0;
        for(int tc = 1; tc <= T; tc++){
            for(int i=0; i<10; i++) {
                int num = sc.nextInt();
                if(num>max){
                    max = num;
                }
            }
            System.out.println("#" + tc + " " + max);
            max = 0;
        }
    }
}
