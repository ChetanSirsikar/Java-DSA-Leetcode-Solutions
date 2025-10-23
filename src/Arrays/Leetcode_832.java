package Arrays;//https://leetcode.com/problems/flipping-an-image/description/
//832. Flipping an Image
import java.util.Arrays;

public class Leetcode_832 {
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){

            for(int i=0;i<(image[0].length+1)/2;i++){
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length-1-i] ^1;
                row[(image[0].length)-i-1] = temp;

            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipAndInvertImage(arr);
        System.out.println(Arrays.deepToString(ans));
    }
}
