package d2;

import java.util.Scanner;

public class D2_1926 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            String num = String.valueOf(tc);
            int cnt=0;
            for(int i=0; i<=num.length(); i++){
                if(num.charAt(i) == '3' ||num.charAt(i) == '3' ||num.charAt(i) == '9'){
                    cnt++;
                }
            }
            if(cnt == 0) System.out.print(cnt);
            else if(cnt == num.length()){
                
            }
        }
    }
}
