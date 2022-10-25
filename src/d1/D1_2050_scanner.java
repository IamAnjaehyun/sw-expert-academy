package d1;

import java.util.Scanner;

public class D1_2050_scanner {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char cha[] = str.toCharArray();

        for (int tc = 0; tc < str.length(); tc++) {
            System.out.print((cha[tc]-'A'+1)+" ");
        }
    }
}
