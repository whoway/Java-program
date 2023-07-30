class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int row = matrix.length;
        if (0 == row) return false;
        int col = matrix[0].length;

        boolean res = false;
        int x = row - 1;
        int y = 0;
        while (0 <= x && y < col) {
            if (target == matrix[x][y]) {
                return true;
            }

            if (target < matrix[x][y]) {
                --x;
            } else {
                ++y;
            }
        }

        return res;
    }
}