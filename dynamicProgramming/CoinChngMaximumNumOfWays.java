package dynamicProgramming;

public class CoinChngMaximumNumOfWays {
// parent problem unbounded knapsack and subsetSum
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value =10;
		int coins[] = {2,5,3,6};
		int n =coins.length;
		System.out.println(subSet(coins,n,value));
	}
	static int subSet(int[] coins, int n,int value) {
		int dp[][]=new int[n+1][value+1];
	// Change from subsetSum is that it is int so false replaces by 0 and true by 1
//		filling 1 row with false  except for dp[0][0] 
		for(int i =1;i<n+1;i++) {
			dp[0][i]=0;
		}
	//filing 1 column with true	
		for(int i =0;i<n+1;i++) {
			dp[i][0]=1;
		}
		for(int i =1;i<n+1;i++) {
			for(int j=1;j<value+1;j++) {
				if(coins[i-1]<=j) {
//					 only change from subsetSum is '||' -> '+'
					// because it is unbouded knapsack dp[i-1] changes to dp[i]
					dp[i][j]=dp[i][j-coins[i-1]] + dp[i-1][j];
				}else
					dp[i][j]= dp[i-1][j];
			}
		}
		return dp[n][value];
	} 
}
