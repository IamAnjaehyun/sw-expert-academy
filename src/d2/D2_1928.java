package d2;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class D2_1928 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            byte[] decoded = Base64.getDecoder().decode(sc.next());
            System.out.println("#"+tc + " "+ new String(decoded, StandardCharsets.UTF_8));
        }
    }
}
