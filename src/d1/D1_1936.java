package d1;

import java.util.Scanner;

public class D1_1936 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        //가위 1 바위 2 보 3

        if(a>b){
            System.out.println("A");
        }else{
            System.out.println("B");
        }

    }
}

