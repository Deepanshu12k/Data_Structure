package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem {

	public static void main(String[] args) {
		  
	    /*int[] arr= {36 ,27 ,-35 ,43 ,-15, 36 ,42 ,-1 ,-29 ,12 ,-23 ,40, 9 ,13 ,-24 ,-10 ,-24, 22,
	    		-14 ,-39 ,18 ,17 ,-21 ,32 ,-20 ,12 ,-27 ,17 ,-15 ,-21 ,-48 ,-28, 8 ,19 ,17 ,43 ,6,
	    		-39 ,-8 ,-21 ,23 ,-29 ,-31, 34 ,-13 ,48 ,-26 ,-35, 20 ,-37 ,-24 ,41 ,30 ,6 ,23 ,12 ,
	    		20 ,46 ,31 ,-45 ,-25 ,34 ,-23 ,-14 ,-45 ,-4 ,-21 ,-37 ,7 ,-26 ,45 ,32 ,-5 ,
	    		-36 ,17 ,-16 ,14 ,-7 ,0 ,37 ,-42 ,26 ,28, 38};	*/
//		int[] arr= {35,29,58,60};
		int[] arr= {10,12,14};
	    int n=arr.length;
	    ArrayList<Integer> diff = new ArrayList<Integer>();
// 	      int start=0;
	      Arrays.sort(arr);
	      for(int i=0;i<n-1;i++){
              
	    	  if(arr[i]>-2 ){
	             diff.add(arr[i+1]-arr[i]);
	           }
		
	      }
	      int start=0;
	      int end =0;
	      
	      if(diff.size()>1){
		      start= diff.get(diff.size()-2);
		     end = diff.get(diff.size()-1);
		      }
	      
	      if(start == end){
	    	System.out.println("start");
	    	  System.out.println(  arr[n-1]+1);  
	      }else {
	    	  System.out.println("end");
	System.out.println(diff.get(diff.size()-1));
	      }
	      
	}

}