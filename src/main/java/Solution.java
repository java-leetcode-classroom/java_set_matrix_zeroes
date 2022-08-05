public class Solution {
  public void setZeroes(int[][] matrix) {
    boolean firstColumnZero = false;
    int ROW = matrix.length, COL = matrix[0].length;
    for (int row = 0; row < ROW; row++) {
      for (int col = 0; col < COL; col++) {
        if (matrix[row][col] == 0) {
          // set row
          matrix[row][0] = 0;
          // set col
          if (col == 0) {
            firstColumnZero = true;
          } else {
            matrix[0][col] = 0;
          }
        }
      }
    }
    for (int row = 1; row < ROW; row++) {
      for (int col = 1; col < COL; col++) {
        if (matrix[row][0] == 0 || matrix[0][col] == 0) {
          if (matrix[row][col] != 0) {
            matrix[row][col] = 0;
          }
        }
      }
    }
    if (matrix[0][0] == 0) {
      for (int col = 0; col < COL; col++) {
        if (matrix[0][col] != 0) {
          matrix[0][col] = 0;
        }
      }
    }
    if (firstColumnZero) {
      for (int row = 0; row < ROW; row++) {
        if (matrix[row][0] != 0) {
          matrix[row][0] = 0;
        }
      }
    }
  }
}
