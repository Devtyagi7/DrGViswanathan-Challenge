package Day15;
public class CountOddNumbers {
    public static int countOdds(int low, int high) {
        int n = high - low + 1;

        if (n % 2 == 0) {
            n /= 2;
        } else {
            if (low % 2 != 0 && high % 2 != 0) {
                n = (n / 2) + 1;
            } else {
                n /= 2;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        int low = 3;
        int high = 7;

        System.out.println(countOdds(low, high));
    }
}
