package Day12;
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        int arraySum = 0;

        for (int i = 0; i < n; i++) {
            arraySum += nums[i];
        }

        return sum - arraySum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }
}
