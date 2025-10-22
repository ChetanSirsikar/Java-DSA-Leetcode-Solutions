//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
//1431. Kids With the Greatest Number of Candies
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>(candies.length);
        int max = 0;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max = candies[i];
            }
        }

        for(int i=0;i<candies.length;i++)
        {

            if(candies[i]+extraCandies>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int extra = 3;
        List<Boolean> ans = kidsWithCandies(arr,extra);
        System.out.println(ans);
    }
}
