package dynamicProgramming;

public class EqualSumPartition {

	public static void main(String[] args) {
		// in this problem we have to check that array can be divided in 
//		equal sum partition or not
//   for ex: 1+5+5 -> 11 so array can divide in {1,5,5,11} -> {11,11}   
		// almost same as subset problem 
     int arr[] = {1,5,11,5};
     int n = arr.length;
     int sum = 0;
     for(int i:arr) {
			sum = sum +i;
		}
     
     if(sum%2!=0) {
    	 System.out.println("false");
     }else if(sum%2==0) {
    	 sum = sum/2;
    	 System.out.println(subSet(arr,n,sum));
     }
   }
	static boolean subSet(int[] arr, int n,int sum) {
		boolean dp[][]=new boolean[n+1][sum+1];
//		filling 1 row with false  except for dp[0][0]
		for(int i =1;i<n+1;i++) {
			dp[0][i]=false;
		}
	// filing 1 column with true	
		for(int i =0;i<n+1;i++) {
			dp[i][0]=true;
		}
		for(int i =1;i<n+1;i++) {
			for(int j=1;j<sum+1;j++) {
				if(arr[i-1]<=j) {
					dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
				}else
					dp[i][j]= dp[i-1][j];
			}
		}
		return dp[n][sum];
	}

}
