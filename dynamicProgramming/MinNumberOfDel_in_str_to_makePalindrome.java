package dynamicProgramming;

public class MinNumberOfDel_in_str_to_makePalindrome {

	//parent problem longest common subsequence 
		public static void main(String[] args) {
		    String str1 = "ABCDGH";
//	        String str1 = "agbcba";
			String  str2 = "";
			for(int k=str1.length()-1;k>=0;k--) {
				str2 = str2+ str1.charAt(k);
			}
			System.out.println(str2);
	        int  i  = str1.length();
	        int j  = str2.length();
	        int result = i-lcs(i,j,str1,str2);
	        System.out.println(result);
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
	    	             if(a==b){
	    	                 dp[i][j]=dp[i-1][j-1]+1;
	    	             }else{
	    	                 dp[i][j]=Math.max(dp[i][j-1] , dp[i-1][j]);
	    	             }
	    	          }
	    	       }
	    	    
	    	  return dp[n][w];
	      }	
}
