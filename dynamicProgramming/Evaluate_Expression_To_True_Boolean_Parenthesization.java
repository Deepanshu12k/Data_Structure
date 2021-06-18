package dynamicProgramming;

import java.util.Arrays;


public class Evaluate_Expression_To_True_Boolean_Parenthesization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String symbols = "TTFT"; // if its character array then change into string 
        String operators = "|&^";
        StringBuilder S = new StringBuilder();
        int n = 0;
       for (int i = 0; i < symbols.length(); i++)
        {
            S.append(symbols.charAt(i));
            if (n < operators.length())
                S.append(operators.charAt(n++));
        }
       System.out.println(S.toString());
         int i =0;
         int  j = S.length()-1;
         int isTrue = 1;
         int[][][] dp=new int[205][205][2];
         
         for(int[][] row:dp) {
        	 for(int[] row2:row) {
        		 Arrays.fill(row2,-1);
        	 }
         }
       System.out.println(solve(S.toString(), i, j, isTrue, dp));
	}
	// isTrue in int to denote true as 1 and false as 0
static int solve(String s,int i,int j,int isTrue,int[][][] dp) {
	       if(i>j) {
	        return 0;
	       }       
	        if(i==j) {
	            if(isTrue==1)
	            return  s.charAt(i)=='T'?1:0;
	            else
	            return s.charAt(i)=='F'?1:0;
	        }
	        
	        if(dp[i][j][isTrue]!=-1) {
	        return dp[i][j][isTrue];
	        }
	        int ans = 0;
	        for(int k=i+1;k<=j-1;k+=2)
	        {
	            int lt;
	            if(dp[i][k-1][1]!=-1)
	            lt = dp[i][k-1][1];
	            else
	             lt = solve(s,i,k-1,1,dp);
	             
	             int lf;
	             if(dp[i][k-1][0]!=-1)
	             lf = dp[i][k-1][0];
	             else
	              lf = solve(s,i,k-1,0,dp);
	              
	              int rt;
	              if(dp[k+1][j][1]!=-1)
	              rt = dp[k+1][j][1];
	              else
	              rt = solve(s,k+1,j,1,dp);
	              
	              int rf;
	              if(dp[k+1][j][0]!=-1)
	              rf = dp[k+1][j][0];
	              else
	              rf = solve(s,k+1,j,0,dp);
	            
	            if( s.charAt(k)=='&')
	            {
	                if(isTrue==1)
	                ans+= lt*rt;
	                else
	                ans+= lt*rf + lf*rt + lf*rf;
	            }else if( s.charAt(k)=='|'){
	                if(isTrue==1)
	                ans+= lt*rf+lf*rt+ lt*rt;
	                else
	                ans+=lf*rf;
	            }else if( s.charAt(k)=='^'){
	                if(isTrue==1)
	                ans+=lt*rf+lf*rt;
	                else
	                ans+=lf*rf+rt*lt;
	            }
	            dp[i][j][isTrue]=ans;
	        }
	        
	        return ans;
	    }
	
}
