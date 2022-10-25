package d1;

import java.util.Scanner;

class D1_2056_scanner {
    public static void main(String args[]) throws Exception {

        Scanner sc=new Scanner(System.in);
        int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
        int t=sc.nextInt();
        sc.nextLine();
        for(int tc=0;tc<t;tc++) {
            String full_day=sc.nextLine();
            String year=full_day.substring(0,4);
            String month=full_day.substring(4,6);
            String day=full_day.substring(6,8);
            if(
                Integer.parseInt(month)>=1 &&
                Integer.parseInt(month)<=12 &&
                Integer.parseInt(day)>=0 &&
                Integer.parseInt(day)<=days[Integer.parseInt(month)-1])
                System.out.println("#"+(tc+1)+" "+year+"/"+month+"/"+day
                );
            else {
                System.out.println("#"+(tc+1)+" -1");
            }
        }
    }
}