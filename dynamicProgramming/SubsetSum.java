package dynamicProgramming;

public class SubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 34, 4, 12, 5, 2};
		int n=arr.length;
		int sum = 0;
		for(int i:arr) {
			sum = sum +i;
		}
		sum = 9;
		System.out.println(subSet(arr,n,sum));
	}
static boolean subSet(int[] arr, int n,int sum) {
	boolean dp[][]=new boolean[n+1][sum+1];
//	filling 1 row with false  except for dp[0][0]
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
