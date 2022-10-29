package d2;

import java.util.Scanner;

public class D2_1986 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int sum=0;
            int cnt=0;
            int time = sc.nextInt();
            for(int i=1;i<=time;i++){
//                sum = 0;
                if(i%2 == 1){
                    cnt = i;
                }else{
                    cnt = -i;
                }
                sum += cnt;
            }
            System.out.println("#"+tc+" "+ sum);

        }
    }
}
