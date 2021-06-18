package dynamicProgramming;

public class UnboundedKnapsack {
// knapsack 1 0  is almost same for only diff look down below 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int W = 100;
        int val[] = {10, 30, 20};
        int wt[] = {5, 10, 15};
        int n = val.length;
        System.out.println(unboundedKnapsack(W, n, val, wt));
	}
static int unboundedKnapsack(int w,int n,int[] val,int[] wt) {
	int[][] dp = new int[n+1][w+1];
    
    for(int i = 0; i <= n; i++){
     for(int j = 0; j <= w; j++){
         if(i==0 || j==0)
           dp[i][j]=0;
      }
    }
    
    for(int i = 1; i <= n; i++){
     for(int j = 1; j <= w; j++){
         if(wt[i-1]<=j){
        	 dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
         	// for making it knapsack 0 1  only 
         	// replace this dp[i][j-wt[i-1]] with this dp[i-1][j-wt[i-1]]
            }else{
        	 dp[i][j]=dp[i-1][j];
         }
       }
    }
 
    return dp[n][w];
 }
}
