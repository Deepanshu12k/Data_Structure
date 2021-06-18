package hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopkFrequent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] nums = {8, 1, 1, 2, 2, 3, 3, 3, 4};
      int k =2;
      int[] arr =  topK(nums, k);
     
       for(int i : arr){
    	 System.out.print(i+" ");
       }
     
	}
	
	
	public static int[] topK(int[] arr, int k) {
	       Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

	        for (int i = 0; i < arr.length; i++) {
	            mp.put(arr[i], mp.getOrDefault(arr[i],0) + 1);
	         }

	        // Create a list from elements of HashMap
	        List<Map.Entry<Integer, Integer>> list =
	            new ArrayList<Map.Entry<Integer, Integer>>(mp.entrySet());

	        // Sort the list
	        Collections.sort(
	            list,
	            new Comparator<Map.Entry<Integer, Integer> >() 
	          {
	                  public int compare(
	                    Map.Entry<Integer, Integer> o1,
	                    Map.Entry<Integer, Integer> o2)
	                {
	                    if (o1.getValue() == o2.getValue()){
	                        if(o2.getKey() > o1.getKey()) return 1;
	                        else 
	                        return -1;
	                      }
	                    else {
	                        if (o2.getValue() > o1.getValue())
	                           return 1;
	                        else
	                           return -1;
	                      }
	                }
	           });

	          int[] ans = new int[k];
	          
	          for (int i = 0; i < k; i++) {
	             ans[i] = list.get(i).getKey();
	           }

	    return ans;
	    
	    }
     
}
