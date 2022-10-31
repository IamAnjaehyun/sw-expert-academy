package d2;

import java.util.Scanner;

public class D2_1959 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int arr1[] = new int[sc.nextInt()]; //첫줄
//            System.out.println(arr1.length);
            int arr2[] = new int[sc.nextInt()]; //둘째줄

            int max = 0;
            int sum = 0;

            for (int i = 0; i < arr1.length; i++) arr1[i] = sc.nextInt();
            for (int i = 0; i < arr2.length; i++) arr2[i] = sc.nextInt();

            //1번 배열이 더 길때
            if (arr1.length > arr2.length) {
                for (int i = 0; i < arr1.length - arr2.length + 1; i++) {
                    sum = 0;
                    // a1 7 / a2 6 / aa 1
                    for (int j = 0; j < arr2.length; j++) {
                        sum += (arr1[j+i] * arr2[j]);
                    }
                    if (sum > max) max = sum;
                }
            } else {
                for (int i = 0; i < arr2.length - arr1.length + 1; i++) {
                    sum = 0;

                    for (int j = 0; j < arr1.length; j++) {
                        sum += (arr1[j] * arr2[j+i]);
                    }
                    if (sum > max) max = sum;
                }
            }
            System.out.println("#" + tc + " " + max);
        }
    }
}

/*
10
3 5
1 5 3
3 6 -7 5 4
7 6
6 0 5 5 -1 1 6
-4 1 8 7 -9 3
5 15
-8 4 6 -9 -1
-1 1 0 -2 10 10 0 2 5 2 10 7 -9 7 -8
11 20
3 -8 4 0 -1 -4 8 3 7 -3 1
3 10 0 1 10 0 -8 -6 9 -7 -1 1 -1 4 10 6 0 -8 -5 0
11 16
-6 0 -1 7 5 -1 -3 0 -9 8 4
0 -6 1 1 8 -8 0 -7 4 -7 -8 -2 1 4 0 -10
3 16
8 9 0
-4 9 -7 -1 -8 3 1 -6 -8 5 2 -7 -9 -10 8 9
11 3
3 -4 -7 7 -2 5 5 0 -2 -8 4
-1 1 3
14 6
-9 9 0 -7 8 10 7 -3 2 3 0 0 0 -2
8 1 -9 3 0 -7
17 10
-6 -1 -4 2 -5 1 -10 -9 8 -9 -6 1 10 0 -5 -8 1
7 6 2 7 -8 4 8 10 -2 9
11 9
8 6 -2 0 0 5 10 2 -10 -8 -10
10 -9 -7 -1 0 8 0 10 3

 */
