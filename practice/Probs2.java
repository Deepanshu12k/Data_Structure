package practice;

public class Probs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr = {4,0,1,3};
		int n = arr.length;
		
//		 long t = 0;
//	        long g=0;
	        if(n%2==0) {
	        	int r = n-1;
	        	for(int i=0;i<n;i++) {
	        		arr[i]=arr[r-i];
	        	}
	        }
	        for(int i = 0;i<n;i++) {
	        	System.out.println(arr[i]);
	        }
//	        for (int i = 0; i < n; i++){ 
//	          t = arr[(int) (arr[i] % n)] + i * n;
//	          arr[(int) (arr[i] % n)] =   t;} 
//	  
//	        // Second Step: Divide all values by n 
//	        for (int i = 0; i < n; i++) {
//	             g= arr[i] / n;
//	            arr[i]=g; }
	}

}
