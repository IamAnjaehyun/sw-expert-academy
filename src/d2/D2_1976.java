package d2;

import java.util.Scanner;

public class D2_1976 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int[] time = new int[4];
        int hour = 0;
        int min = 0;


        for (int tc = 1; tc <= T; tc++) {
            for(int i=0;i<4;i++){
                time[i]=sc.nextInt();
            }
            hour = time[0]+time[2];
            min = time[1]+time[3];

            if(min>60){
                hour += 1;
                min -= 60;
            }
            if(hour>12){
                hour -= 12;
            }
            System.out.println("#"+tc+" "+hour + " "+ min);

        }
    }
}
