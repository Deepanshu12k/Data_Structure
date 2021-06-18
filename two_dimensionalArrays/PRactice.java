package two_dimensionalArrays;

public class PRactice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[]  arr= {1,2,4,56,2,676,789};  
     int[ ]  list  = {5,2,19,84};
     int n=arr[arr.length-1];
     int[] count = new int[10000];
   
    for(int i=0;count.length>i;i++) {
	      count[arr[i]]++;
    	  if(count[arr[i]] > 1) {
    		  System.out.println(i);
    	  }
    	  
     }
       for(int i:arr) {
    	 System.out.println(i);
    }
    // codenation 
    // 
   
	}

}
//O(1)>O(log n)>O(n)>O(nlogn)>O(n^2)>O(2^n)
// 
//                   mid  = left + (right - left)/2;
//mid  = (left + right )2;