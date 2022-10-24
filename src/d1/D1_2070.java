package d1;
import java.util.Scanner;
class D1_2070
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int tc = 1; tc <= T; tc++)
        {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            if(a1>a2){
                System.out.println("#" + tc + " >");
            } else if (a1<a2) {
                System.out.println("#" + tc + " <");
            }else {
                System.out.println("#" + tc + " =");
            }
        }
    }
}