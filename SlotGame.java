import java.util.* ;
import java.io.*; 
public class Solution {
	public static int slotScore(String original, String guess) {
		char given[] = original.toCharArray();
		char check[] = guess.toCharArray();
		int count = 0;
		// calculate Perfect Match
		for(int i=0;i<check.length;i++){
				if(given[i] == check[i]){
					count+=2;
					given[i] = '#';
				    check[i] = '#';
				}
		}
		// now Calculate parcitial match
		for(int i=0;i<check.length;i++){
			if(check[i] == '#')
				continue;
			for(int j=0;j<given.length;j++){
				if(check[i] == given[j]){
					count++;
					given[j] = '#';
					break;
				}
			}
		}
		return count;
	}
}
