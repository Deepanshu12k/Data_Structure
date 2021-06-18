package practice;
//import java.util.Arrays;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {36 ,27 ,-35 ,43 ,-15, 36 ,42 ,-1 ,-29 ,12 ,-23 ,40, 9 ,13 ,-24 ,-10 ,-24, 22,
	    		-14 ,-39 ,18 ,17 ,-21 ,32 ,-20 ,12 ,-27 ,17 ,-15 ,-21 ,-48 ,-28, 8 ,19 ,17 ,43 ,6,
	    		-39 ,-8 ,-21 ,23 ,-29 ,-31, 34 ,-13 ,48 ,-26 ,-35, 20 ,-37 ,-24 ,41 ,30 ,6 ,23 ,12 ,
	    		20 ,46 ,31 ,-45 ,-25 ,34 ,-23 ,-14 ,-45 ,-4 ,-21 ,-37 ,7 ,-26 ,45 ,32 ,-5 ,
	    		-36 ,17 ,-16 ,14 ,-7 ,0 ,37 ,-42 ,26 ,28, 38};
		int n = arr.length;
		 boolean[] present = new boolean[n + 1]; 
		
		 for (int i = 0; i < n; i++) {
			 if (arr[i] > 0 && arr[i] <= n) 
             present[arr[i]] = true; 
     } 
		 for (int i = 1; i <= n; i++) {
	            if (!present[i]) {
	                System.out.println(i); 
	            }
	       }
		 System.out.println(n+1); 
	}

}
