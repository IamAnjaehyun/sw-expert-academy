package d1;

import java.util.Scanner;

class D1_2058_scanner {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<=4; i++){
            sum += count%10;
            count /= 10;
        }
        System.out.println(sum);
    }
}
