package Day20;
public class NumberOfSteps {

    public static int numberOfSteps(int num) {

        int steps = 0;

        while (num != 0) {

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }

            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {

        int num = 14;

        System.out.println("Number of Steps: " + numberOfSteps(num));
    }
}
