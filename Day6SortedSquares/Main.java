package Day6SortedSquares;
import java.util.*;

public class Main {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int k = n - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[k] = nums[left] * nums[left];
                left++;
            } else {
                result[k] = nums[right] * nums[right];
                right--;
            }
            k--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = sortedSquares(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
