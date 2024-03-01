import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int getNewNum(ArrayList<Integer> arr, int n) {
        int maxNum = -1;
        int answer = 0;
        for(int x:arr){
            if(x > maxNum)
                maxNum = x;
        }
        int maxBits = 0;
        int countZero = 0;
        int countOne = 0;
        while(maxNum != 0){
            maxBits++;
            maxNum = (maxNum>>1);
        }
        int k = 0;
        while(maxBits-- != 0){
            countOne = 0;
            countZero = 0;
            for(int i=0;i<n;i++){
               if((arr.get(i)&1)!=0)
                   countOne++;
               else    
                   countZero++;
               arr.set(i,(arr.get(i)>>1));
            }
            if(countZero < countOne){
                answer = answer+(1<<k);
            }
            k++;
        }
        return answer;
    }
}
