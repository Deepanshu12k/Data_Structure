package dynamicProgramming;

public class CountOfSubsetsSum {
// count of subset sum with given sum 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	its parent problem subsetSum 
     int arr[] = {1,2,3,3};
     int n=arr.length;
	int sum = 6;
	System.out.println(subSet(arr,n,sum));
	}
static int subSet(int[] arr, int n,int sum) {
	int dp[][]=new int[n+1][sum+1];
// Change from subsetSum is that it is int so false replaces by 0 and true by 1
//	filling 1 row with false  except for dp[0][0] 
	for(int i =1;i<n+1;i++) {
		dp[0][i]=0;
	}
//filing 1 column with true	
	for(int i =0;i<n+1;i++) {
		dp[i][0]=1;
	}
	for(int i =1;i<n+1;i++) {
		for(int j=1;j<sum+1;j++) {
			if(arr[i-1]<=j) {
//				 only change from subsetSum is '||' -> '+'
				dp[i][j]=dp[i-1][j-arr[i-1]] + dp[i-1][j];
			}else
				dp[i][j]= dp[i-1][j];
		}
	}
	return dp[n][sum];
} 
	

}
