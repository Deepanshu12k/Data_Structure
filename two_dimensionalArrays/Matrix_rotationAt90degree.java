package two_dimensionalArrays;

public class Matrix_rotationAt90degree {

	public static void main(String[] args) {
		int matrix[][] = {{1, 2, 3},
	                                {4, 5, 6},
	                               {7, 8, 9}};
//		int matrix[][] = {{1, 2},
//	                                {3, 4}};
		int n = matrix.length;
		for(int row =0;row<n;row++) {
			for(int col=row+1;col<n;col++) {
				int count = matrix[row][col] ;
				matrix[row][col] = matrix[col][row];
				matrix[col][row] = count;
			}
		}
		int temp=0;
		
		for (int i = 0; i < n; i++) { 
            for (int j = 0, k = n - 1;  j < k; j++, k--) { 
                temp = matrix[j][i]; 
                matrix[j][i] = matrix[k][i]; 
                matrix[k][i] = temp; 
            } 
		}
		
		for(int row =0;row<n;row++) {
			for(int col=0;col<n;col++) {
				System.out.print(matrix[row][col]+" " );
				}
			System.out.println();
	    }
		
	}
}
