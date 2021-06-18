package dynamicProgramming;

public class CoinChngMinNumOfCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int value = 5;          
//			int	coins[] = {3,6,3};             ans -> -1 in those cases when not possible
 		int value = 10;
		int coins[] = {2,5,3,6};  // ans -> 2
		int n  = coins.length;
		System.out.println(minimumNumberOfCoins(coins,n,value));
	}
	public static long minimumNumberOfCoins(int coins[],int n,int value)
    {
        long[][] dp=new long[n+1][value+1];
     
     for(int i = 0; i <= n; i++){
        for(int j = 0; j <= value; j++){
            if(j==0) dp[i][j]=0;
            if(i==0) dp[i][j]=Integer.MAX_VALUE-1;
         }
       }
       for(int j =1;j<value+1;j++){
           if(j%coins[0]==0)
           dp[1][j]=j/coins[0];
           else
           dp[1][j]=Integer.MAX_VALUE-1;
       }
       // again unbounded knapsack  with little bit of alteration
     for(int i=2;i<=n;i++){
         for(int j=1;j<=value;j++){
             if(coins[i-1]<=j){
                 dp[i][j]= Math.min(1+ dp[i][j-coins[i-1]],dp[i-1][j]);
             }else{
                 dp[i][j]=dp[i-1][j];
             }
             
         }
     }
     if(dp[n][value]==0 || dp[n][value]==Integer.MAX_VALUE-1)
    	 dp[n][value]=-1;
     
     return dp[n][value];
    }
}
