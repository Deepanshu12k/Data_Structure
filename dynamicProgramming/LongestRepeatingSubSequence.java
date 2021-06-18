package dynamicProgramming;

public class LongestRepeatingSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String str1 = "AABEBCDD";  // abd is repeating twice
//		 String str1 = "ABC";
		 String  str2 = str1;
        int  i  = str1.length();
        int j  = str2.length();
        
        System.out.println(lcs(i,j,str1,str2));
	}
      static int lcs(int n,int w,String s1,String s2 ) {
    	  int[][] dp = new int[n+1][w+1];
    	    
    	    for(int i = 0; i <= n; i++){
    	     for(int j = 0; j <= w; j++){
    	         if(i==0 || j==0)
    	           dp[i][j]=0;
    	      }
    	    }
    	    for(int i = 1; i <= n; i++){
    	        for(int j = 1; j <= w; j++){
    	        	 char a = s1.charAt(i-1);
    	             char b = s2.charAt(j-1);
    	             // only change from lcs
    	             if(a==b && i!=j){
    	                 dp[i][j]=dp[i-1][j-1]+1;
    	             }else{
    	                 dp[i][j]=Math.max(dp[i][j-1] , dp[i-1][j]);
    	             }
    	          }
    	       }
    	    
    	  return dp[n][w];
      }
	

}
