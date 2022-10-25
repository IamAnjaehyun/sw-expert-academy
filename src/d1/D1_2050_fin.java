package d1;

import java.io.File;
import java.util.Scanner;

public class D1_2050_fin {
    public static void main(String args[]) throws Exception {
        File fin = new File("res/input.txt");

        Scanner sc = new Scanner(fin);
        String str = sc.nextLine();
        char cha[] = str.toCharArray();

        for (int tc = 0; tc < str.length(); tc++) {
            System.out.print((cha[tc]-'A'+1)+" ");
        }
    }
}
