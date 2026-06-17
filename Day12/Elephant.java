package Day12;
import java.util.*;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int count = 0;

        while (x > 0) {
            x -= 5;
            count++;
        }

        System.out.println(count);

    }
}
