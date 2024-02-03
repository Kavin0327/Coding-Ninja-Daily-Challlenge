import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findProductSumDifference(int n) {
        int sum = 0;
        int product = 1;
        while(n > 0){
            int rem = n%10;
            product *= rem;
            sum += rem;
            n /= 10;
        }
        return product - sum;
    }
}
