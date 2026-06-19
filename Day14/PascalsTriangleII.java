package Day14;
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();

        int n = rowIndex + 1;

        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    ans.get(i).add(1);
                } else {
                    int value = ans.get(i - 1).get(j)
                              + ans.get(i - 1).get(j - 1);

                    ans.get(i).add(value);
                }
            }
        }

        return ans.get(rowIndex);
    }

    public static void main(String[] args) {
        int rowIndex = 4;

        System.out.println(getRow(rowIndex));
    }
}
