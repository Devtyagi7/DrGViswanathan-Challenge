package Day13;
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x < 0)
            return false;

        int original = x;
        int reverse = 0;

        while (x > 0) {
            int rem = x % 10;
            reverse = reverse * 10 + rem;
            x /= 10;
        }

        if (original == reverse)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        int x = 121;

        if (isPalindrome(x))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
