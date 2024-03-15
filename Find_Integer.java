import java.util.* ;
import java.io.*; 

public class Solution {
	public static int findInteger(int n, int k) {
		// List<Integer> list = new ArrayList<>();   // It occur Time Limit Exceted and Space 
		// for(int i=1;i<=n;i+=2){
		// 	list.add(i);
		// }
		// for(int i=2;i<=n;i+=2){
  	// 	list.add(i);
		// }
		// return list.get(k-1);
		if(k <= (n+1)/2)
			return 2*k-1;
		else
			return 2*(k-(n+1)/2);
	}
}
