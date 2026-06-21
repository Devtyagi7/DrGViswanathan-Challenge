package Day16;
public class RotateImage {

    public static void rotate(int[][] mat) {

        // Transpose Matrix
        for (int i = 1; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Reverse Each Row
        for (int i = 0; i < mat.length; i++) {
            int stCol = 0;
            int endCol = mat[0].length - 1;

            while (stCol < endCol) {
                int temp = mat[i][endCol];
                mat[i][endCol] = mat[i][stCol];
                mat[i][stCol] = temp;

                stCol++;
                endCol--;
            }
        }
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotate(mat);

        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
