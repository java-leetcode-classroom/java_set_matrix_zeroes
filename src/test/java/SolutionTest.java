import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void setZeroesExample1() {
    // matrix = [[1,1,1],[1,0,1],[1,1,1]]
    int matrix[][] = {
        {1,1,1},
        {1,0,1},
        {1,1,1}
    };
    sol.setZeroes(matrix);
    assertArrayEquals(new int[][]{
        {1,0,1},
        {0,0,0},
        {1,0,1}
    }, matrix);
  }
  @Test
  void setZeroesExample2() {
    // matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
    int matrix[][] = {
        {0,1,2,0},
        {3,4,5,2},
        {1,3,1,5}
    };
    sol.setZeroes(matrix);
    assertArrayEquals(new int[][]{
        {0,0,0,0},
        {0,4,5,0},
        {0,3,1,0}
    }, matrix);
  }
}