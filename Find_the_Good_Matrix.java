import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Integer>> findGoodMatrix(ArrayList<ArrayList<Integer>> arr) {
          boolean isRowZero = false;
          boolean isColZero = false;
		  int n = arr.size();
		  int m = arr.get(0).size();
		  for(int i=0;i<m;i++){
			  if(arr.get(0).get(i) == 0){
				  isRowZero = true;
			  }
		  }
		  for(int i=0;i<n;i++){
			  if(arr.get(i).get(0) == 0){
				  isColZero = true;
			  }
		  }
		  for(int i=1;i<n;i++){
			  for(int j=1;j<m;j++){
				  if(arr.get(i).get(j) == 0){
					  arr.get(i).set(0,0);
					  arr.get(0).set(j,0);
				  }
			  }
		  }
		  for(int i=1;i<n;i++){
			  for(int j=1;j<m;j++){
				  if(arr.get(i).get(0) == 0 || arr.get(0).get(j) == 0)
				  	arr.get(i).set(j,0);
			  }
		  }
		  if(isRowZero){
			  for(int i=0;i<m;i++){
				  arr.get(0).set(i,0);
			  }
		  }
		  if(isColZero){
			  for(int i=0;i<n;i++){
				  arr.get(i).set(0,0);
			  }
		  }
		  return arr;
	}
}
