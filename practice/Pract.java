package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1, 2};
//		int n = arr1.length;
		int[] arr2 ={3,4};
//		int m = arr2.length;
		 ArrayList<Integer> mv = new ArrayList<Integer>();
		 Set<Integer> set = new HashSet<Integer>();
	       Set<Integer> set2 =  new HashSet<Integer>();
	       for(int i : arr1) {
	    	   set.add(i);
	       } 
	       for(int j : arr2) {
	    	   set2.add(j);
	       }
	       set.retainAll(set2);
	       
	       for(int r : set){
	            mv.add(r);
	        }
	       
	        if(mv.isEmpty()){
	            mv.add(-1);
	        }
	        System.out.print(mv);
//	        return mv;
	       
	}

}
