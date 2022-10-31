package d2;

import java.util.Scanner;



public class D2_2007 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 0; tc <= T; tc++) {
            String str = sc.nextLine();
            //str.substring(0, i) 으로 해놓고 i를 0부터 돌려서 안돌아가고 있었음..
            //0~1 부터 0~xx 까지 해야되니 i는 1부터 시작!!!
            for (int i = 1; i <= (str.length()/2); i++) {
                if (str.substring(0, i).equals(str.substring(i, 2 * i))) {
                    System.out.println("#"+tc+" " + i);
                    break;
                }
            }
        }
        sc.close();
    }
}

/*
10
KOREAKOREAKOREAKOREAKOREAKOREA
SAMSUNGSAMSUNGSAMSUNGSAMSUNGSA
GALAXYGALAXYGALAXYGALAXYGALAXY
EXOEXOEXOEXOEXOEXOEXOEXOEXOEXO
B1A4B1A4B1A4B1A4B1A4B1A4B1A4B1
APINKAPINKAPINKAPINKAPINKAPINK
BLACKPINKBLACKPINKBLACKPINKBLA
TWICETWICETWICETWICETWICETWICE
REDVELVETREDVELVETREDVELVETRED
ABCABCABCABCABCABCABCABCABCABC
 */