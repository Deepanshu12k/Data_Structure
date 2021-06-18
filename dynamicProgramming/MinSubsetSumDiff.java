package dynamicProgramming;



public class MinSubsetSumDiff {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int arr[] = {1,6,11,5};
		 int arr[] = {1,2,7};
	     int n=arr.length;
	     int sum =0;
	     for(int i:arr) {
				sum = sum +i;
			}
	     boolean dp[][]=new boolean[n+1][sum+1];
	     subSet(arr,n,sum,dp);
	   
		int min =Integer.MAX_VALUE;
		for(int j =sum/2;j>=0;j--) {
			if(dp[n][j]==true) {
				min = sum-(2*j);
				break;
			}
		}
	     
		System.out.println(min);
	     
	}
	static void subSet(int[] arr, int n,int sum,boolean dp[][]) {
		
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
		
	}
}
