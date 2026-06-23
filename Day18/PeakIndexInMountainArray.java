package Day18;
public class PeakIndexInMountainArray {

    public static int peakIndexInMountainArray(int[] arr) {

        int low = 1;
        int high = arr.length - 2;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }
            else if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                high = mid - 1;
            }
            else if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {0, 2, 5, 7, 4, 1};

        System.out.println(peakIndexInMountainArray(arr));
    }
}
