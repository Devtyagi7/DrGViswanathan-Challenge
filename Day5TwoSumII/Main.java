package Day5TwoSumII;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int i = 0;
        int j = n - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                System.out.println((i + 1) + " " + (j + 1));
                return;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
    }
}
