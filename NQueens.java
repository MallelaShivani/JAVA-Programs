import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        int[] queens = new int[n]; // queens[i] = column of queen in row i
        Arrays.fill(queens, -1);
        boolean[] columns = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1];
        boolean[] diag2 = new boolean[2 * n - 1];
        backtrack(solutions, queens, n, 0, columns, diag1, diag2);
        return solutions;
    }
    private void backtrack(List<List<String>> solutions, int[] queens, int n, int row,
                           boolean[] columns, boolean[] diag1, boolean[] diag2) {
        if (row == n) {
            solutions.add(generateBoard(queens, n));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (columns[i] || diag1[row - i + n - 1] || diag2[row + i]) {
                continue;
            }
            queens[row] = i;
            columns[i] = diag1[row - i + n - 1] = diag2[row + i] = true;
            backtrack(solutions, queens, n, row + 1, columns, diag1, diag2);
            columns[i] = diag1[row - i + n - 1] = diag2[row + i] = false;
        }
    }
    private List<String> generateBoard(int[] queens, int n) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[queens[i]] = 'Q';
            board.add(new String(row));
        }
        return board;
    }
    public static void main(String[] args) {
        NQueens nq = new NQueens();
        int n = 4; // Change this to test with different sizes
        List<List<String>> solutions = nq.solveNQueens(n);
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
