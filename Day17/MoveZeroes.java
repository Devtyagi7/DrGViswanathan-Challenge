package Day17;
public class MoveZeroes {

    public static void moveZeroes(int[] arr) {

        int i = 0, j = 0;

        while (j < arr.length) {

            if (arr[j] != 0) {

                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

                i++;
            }

            j++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        moveZeroes(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
