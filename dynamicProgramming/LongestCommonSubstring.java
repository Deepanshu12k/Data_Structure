package dynamicProgramming;

public class LongestCommonSubstring {
// parent problem longest common subsequence
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		   String str1 = "ABCDGH";
//			String  str2 = "AEDFHR";
			 String str1 = "123234";
			 String  str2 = "234523";
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
	    	    int max = 0;
	    	    for(int i = 1; i <= n; i++){
	    	        for(int j = 1; j <= w; j++){
	    	        	 char a = s1.charAt(i-1);
	    	             char b = s2.charAt(j-1);
	    	             if(a==b){
	    	                 dp[i][j]=dp[i-1][j-1]+1;
	    	                 max  = Math.max(dp[i][j], max);
	    	             }else{
	    	            	 // only change from longest common subsequence
	    	                 dp[i][j]=0;
	    	           
	    	             }
	    	          }
	    	       }
	    	    
	    	  return max;
	}

}
