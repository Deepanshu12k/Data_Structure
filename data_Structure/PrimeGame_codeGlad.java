package data_Structure;

import java.util.*;


public class PrimeGame_codeGlad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	      int l = 4;
	      int r =5;

	      int max = 0;
	      int entry  = 0;
	      ArrayList<Integer> list = primes(r);
	    System.out.println(list);
       boolean check= false;	      
	      while(l!=r) {
	    	 entry = 1;
	    	 if(!list.contains(l)) {
	    		 l++;
	    		}else if(!list.contains(r)) {
	    		 r--;
	    		}else {
	    		 max =Math.max(max, r-l);
	    		 break;
	    	 }
	    	 if(list.contains(l) || list.contains(r)) {
	    		 check =true;
	    	 }
	    }
	      
	      if(entry == 0)
	          System.out.println(max);
	      else if(max==0 && check == false)
	    	  System.out.println("-1");
	      else
	    	  System.out.println(max);
	      
//  scan.close();
	   }
	
	 static ArrayList<Integer> primes(int n){
	      ArrayList<Integer> mv = new ArrayList<Integer>();
	        boolean prime[] = new boolean[n + 1];
	        for (int i = 0; i <= n; i++)
	            prime[i] = true;
	 
	        for (int p = 2; p * p <= n; p++){
	           if (prime[p] == true){
	              for (int i = p * p; i <= n; i += p)
	                    prime[i] = false;
	            }
	        }
	 
	        for (int i = 2; i <= n; i++){
	            if (prime[i] == true)
	                 mv.add(i);
	        }
	  return  mv;
	}
}

