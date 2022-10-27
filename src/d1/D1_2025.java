package d1;

import java.util.Scanner;

public class D1_2025 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int sum = 0;
        for(int tc = 1; tc <= T; tc++)
        {
            sum += tc;
        }
        System.out.println(sum);
    }
}

