package dynamicProgramming;

import java.util.Arrays;

public class EggDroppingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e = 2, f = 36;
		int dp[][]= new int[11][101]; 
		for(int[] row : dp) {
			Arrays.fill(row,-1 );
		}
        System.out.print( eggDrop(e, f,dp));
	}
static int eggDrop(int e,int f,int[][] dp) {
	if(f==0 || f==1 ) return f;
	if(e==1) return f ;
	if(dp[e][f]!=-1) return dp[e][f]; 
	
	int ans =Integer.MAX_VALUE;
	int high=0,low=0;
	for(int k=1;k<=f;k++) {
		if(dp[e-1][k-1]!=-1) {
			low = dp[e-1][k-1];
		}else {
			dp[e-1][k-1]=eggDrop(e-1,k-1,dp);
			low = dp[e-1][k-1];
		}
		if(dp[e][f-k]!=-1) {
			high = dp[e][f-k];
		}else {
			dp[e][f-k]=eggDrop(e,f-k,dp);
			high = dp[e][f-k];
		}
		int temp = 1+ Math.max(low, high);
		ans =  Math.min(ans, temp);
	}
	
	dp[e][f]=ans;
	return ans;
}
}
