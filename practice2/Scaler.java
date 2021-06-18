package practice2;

import java.util.Arrays;

//find the bth smallest element 
public class Scaler {
	 public static void main(String []args){ 
	      int[] arr = {1,5,7,3,2};
	      int b = 9;
	      int ans = solve(arr,b);
	      System.out.println(ans);
	    } 
	 static int solve(int[] arr,int b) {
		int ans=0;
		int n = arr.length;
		Arrays.sort(arr);
		int low = 0; 
		int high=arr[n-3]+arr[n-2]+arr[n-1];
		//binary search 
		while(low<=high) {
			int mid = (high-low)/2 + low;
			//triplets less than or equal to mid
			int count = check(arr,mid);
			if(count>=b) {
				high=mid-1;
			}else {
				ans = mid;
				low = mid+1;
			}
		}
		return ans;
	 }
	 
	 static int check(int[] arr, int val) {
		int count = 0;
		int n = arr.length;
		for(int i=0;i<n;i++) {
		  int left=i+1,right = n-1;
		  
		  while(left<=right) {
			  if(arr[i]+arr[left]+arr[right]<val) {
				  count = count+ right-left;
				  left++;
			  }else {
				  right--;
			  }
		  }
		  
		}
		 return count;
	 }
}
