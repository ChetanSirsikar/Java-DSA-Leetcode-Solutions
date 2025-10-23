package Arrays;//https://leetcode.com/problems/transpose-matrix/description/
//867. Transpose Matrix
import java.util.Arrays;

public class Leetcode_867 {
    public static int[][] transpose(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[col][row];
        for(int i = 0 ;i<row;i++){
            for(int j=0;j<col;j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = transpose(arr);
        System.out.println(Arrays.deepToString(ans));
    }
}
