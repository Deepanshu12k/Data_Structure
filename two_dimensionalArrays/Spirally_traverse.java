package two_dimensionalArrays;

import java.util.ArrayList;

public class Spirally_traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int mat[][] = {{1, 2 ,  3,  4},
                               {5, 6 , 7 ,  8},
                               {9,10,11,12}};
       int R = mat.length;
       int C = mat[0].length;
       
       // this solution not work for all test cases
       System.out.println( spirallyTraverse(mat,R,C));
      
	}
	static ArrayList<Integer> spirallyTraverse(int a[][], int m, int n){
		 ArrayList<Integer> mv = new ArrayList<Integer>();
		    int i, k = 0, l = 0; 
		        /*  k - starting row index 
		        m - ending row index 
		        l - starting column index 
		        n - ending column index 
		        i - iterator 
		        */
		  
		        while (k < m && l < n) { 
		            // Print the first row from the remaining rows 
		            for (i = l; i < n; ++i) { 
		                mv.add(a[k][i]); 
		            } 
		            k++; 
		  
		            // Print the last column from the remaining columns 
		            for (i = k; i < m; ++i) { 
		                mv.add(a[i][n - 1]); 
		            } 
		            n--; 
		  
		            // Print the last row from the remaining rows */ 
		            if (k < m) { 
		                for (i = n - 1; i >= l; --i) { 
		                    mv.add(a[m - 1][i]); 
		                } 
		                m--; 
		            } 
		            if (l < n) { 
		                for (i = m - 1; i >= k; --i) { 
		                    mv.add(a[i][l]); 
		                } 
		                l++; 
		            } 
		        }    
		        return mv; // recursive solution on geeks for geeks 
		    }
		}
