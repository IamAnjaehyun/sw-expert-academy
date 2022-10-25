package d1;

import java.io.File;
import java.util.Scanner;

class D1_2056_fin {
    public static void main(String args[]) throws Exception {

        File fin = new File("res/input.txt");
		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(fin);
        int T;
        T = Integer.parseInt(sc.nextLine());
        String date = "";
        int yearI = 0;
        int monthI = 0;
        int dayI = 0;
        String dayS;
        String monthS;
        String yearS;
        int[] ymd = new int[8];
        for (int tc = 0; tc < T; tc++) {
            date = sc.nextLine();
            yearI = Integer.parseInt(date.substring(0, 4));
            yearS = date.substring(0, 4);
            monthS = date.substring(4, 6);
            monthI = Integer.parseInt(date.substring(4, 6));
            dayS = date.substring(6, 8);
            dayI = Integer.parseInt(date.substring(6, 8));
            int answer = 0;
            switch (monthS) {
                case "00":
                    answer = 1;
                case "01":
                case "03":
                case "05":
                case "07":
                case "08":
                case "10":
                case "12":
                    if (dayI < 1 || dayI > 31) {
                        answer = 1;
                    } else {
                        break;
                    }
                case "02":
                    if (dayI < 1 || dayI > 28) {
                        answer = 1;
                    } else {
                        break;
                    }
                case "04":
                case "06":
                case "09":
                case "11":
                    if (dayI < 1 || dayI > 30) {
                        answer = 1;
                    } else {
                        break;
                    }
            }
            if (answer == 0) System.out.println("#" + (tc + 1) + " " + yearS + "/" + monthS + "/" + dayS);
            else System.out.println("-1");
        }

    }
}