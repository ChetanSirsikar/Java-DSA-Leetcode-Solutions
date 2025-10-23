package Math;//https://leetcode.com/problems/matrix-diagonal-sum/description/
//1572. Matrix Diagonal Sum

public class Leetcode_1572 {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i=0;i<n;i++){
            sum+= mat[i][i];
            sum+=mat[n-1-i][i];
        }
        if(n %2 != 0 ){
            sum = sum - mat[n/2][n/2];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,1,1},
        {1,1,1,1},
        {1,1,1,1},
        {1,1,1,1}};
        int ans = diagonalSum(arr);
        System.out.println(ans);
    }
}
