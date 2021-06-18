package two_dimensionalArrays;

public class Deteminant_2ndmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{1, 0, 2, -1},
                                {3, 0, 0, 5},
                                {2, 1, 4, -3},
                                {1, 0, 5, 0}};
int n = mat.length;
// this solution not work for all test cases
System.out.println( determinantOfMatrix(mat,  n));
	}

	static int determinantOfMatrix(int mat[][], int n){  
		   int det=1,sign =1;
		   int[][] b = new int[n][n];
			if(n==1) {
			  return mat[0][0];
		   }else {
			   det=0;
			   for(int c =0;c<n;c++) {
				  int p=0,q=0;
				  for(int i =0;i<n;i++) {
					  for(int j=0;j<n;j++) {
						  b[i][j]=0;
						  if(i!=0 && j!=c) { 
							  b[p][q]=mat[i][j];
							  if(q<n-2) {
								  q++;
							  }else {
								  q=0;
								  p++;
							  }
						  }
						  
					  }
				  }
			    det = det+ sign *(mat[0][c]*determinantOfMatrix(b,n-1));
			    System.out.println(det);
				sign = -1*sign;
			   }
			}
		return det;
	 }  
 }  

