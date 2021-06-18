package dynamicProgramming;

import java.util.Arrays;

public class MatrixChainMutliplication {
	static int[][] dp = new int[100][100];
	public static void main(String[] args) {
		int arr[] = {5, 2, 7, 4, 9}  ;
        int i =1; // starting with index 1
        int j = arr.length-1;
        
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
      System.out.println(mcm(arr,i,j));
}
static int mcm(int[] arr,int i,int j) {
	if(i>=j) {
		return 0;
	}
	if(dp[i][j]!=-1) {
	    	return dp[i][j];
	}
	int mn = Integer.MAX_VALUE;
	
	for(int k=i;k<=j-1;k++) {
		int temp = mcm(arr,i,k)+mcm(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];
		if(temp<mn) { 
			mn = temp;
			}
	}
	dp[i][j]=mn;
	return dp[i][j];
   }
}
