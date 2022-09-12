package Matrix;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] ans = {{1, 2, 3}, {4, 5, -6}, {-7, -8, -9}};
        int ans1 = countNegatives(ans);
        System.out.println(ans1);
    }

    public static int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
