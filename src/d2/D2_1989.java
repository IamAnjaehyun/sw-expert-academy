package d2;

import java.util.Scanner;

public class D2_1989 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            String str = sc.next();
            int result = 1;

            for(int i=0; i<str.length()/2+1; i++){
                if(str.charAt(i) != str.charAt(str.length()-i-1)){
                    result = 0;
                }
            }
            System.out.println("#"+tc+" "+result);
        }
    }
}
