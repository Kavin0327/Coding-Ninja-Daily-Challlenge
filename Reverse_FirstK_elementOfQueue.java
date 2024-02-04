import java.util.* ;
import java.io.*; 
public class Solution 
{
  public static Queue<Integer> reverseElements(Queue<Integer> q, int k) 
  {
    List<Integer> list = new ArrayList<>();
    while(!q.isEmpty()){
      list.add(q.poll());
    }
    for(int i=k-1;i>=0;i--){
      q.offer(list.get(i));
    }
    for(int i=k;i<list.size();i++){
      q.offer(list.get(i));
    }
    return q;
  }
}
