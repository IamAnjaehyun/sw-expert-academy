package d1;

import java.io.File;
import java.util.Scanner;

class D1_2058_fin
{
    public static void main(String args[]) throws Exception
    {
        File fin = new File("res/input.txt");
        String str = "";
        Scanner sc = new Scanner(fin);
        int sum = 0;
        while(sc.hasNextLine()){
            str = sc.nextLine();
            String[] sumMath = str.split("");
            int[] a = new int[sumMath.length];
            for(int i=0; i<sumMath.length; i++){
                sum += Integer.parseInt(sumMath[i]);
//                System.out.println(a[i]);
            }
        }
        System.out.println(sum);
    }
}