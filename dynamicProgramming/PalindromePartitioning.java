package dynamicProgramming;

import java.util.Arrays;

public class PalindromePartitioning {
	static int[][] dp = new int[100][100];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "abcde";
     int i =0;
     int j = str.length()-1;
     for (int[] row : dp) {
         Arrays.fill(row, -1);
     }
   System.out.println(palindromePartitioning(str,i,j));
	}
static int palindromePartitioning(String str,int i,int j) {
	if(i>=j) return 0;
	
	if(isPalindrome(str,i,j)==true) {
	 dp[i][j]=0;
	 return dp[i][j];
	}
	if(dp[i][j]!=-1) return dp[i][j];
	
	int mn = Integer.MAX_VALUE;
	
	for(int k=i;k<j;k++) {
		int temp = 1+palindromePartitioning(str,i,k) + palindromePartitioning(str,k+1,j);
		mn = Math.min(temp,mn);
	}
	dp[i][j]=mn;
	
	return dp[i][j];
}
  static boolean isPalindrome(String str, int i,int j) {
		while(i<j) {
		   if(str.charAt(i)!=str.charAt(j)) {
		    	return false;
		  }
	    	i++;
		    j--;
	}
	
	return true;
 }
}
