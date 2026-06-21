package Day16;
import java.util.*;

public class SoldierAndBananas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int ans = 0;

        for (int i = 1; i <= w; i++) {
            ans += k * i;
        }

        if (ans <= n) {
            System.out.println(0);
        } else {
            System.out.println(ans - n);
        }
    }
}