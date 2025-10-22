package Arrays;

//https://leetcode.com/problems/richest-customer-wealth/
//1672. Richest Customer Wealth
public class Leetcode_1672 {
    public static int maximumWealth(int[][] accounts) {
        int rowsum = Integer.MIN_VALUE;
        for(int acc = 0;acc<accounts.length;acc++){
            int wealth = 0;
            for(int cus=0;cus<accounts[acc].length;cus++)
            {
                wealth +=accounts[acc][cus];
            }
            if(wealth>rowsum){
                rowsum=wealth;
            }
        }
        return rowsum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1}};
        int ans = maximumWealth(arr);
        System.out.println(ans);
    }

}
