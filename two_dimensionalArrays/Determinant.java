package two_dimensionalArrays;

public class Determinant {
   public static void main(String[] args) {
		int mat[][] = {{1, 0, 2, -1},
	                            {3, 0, 0, 5},
	                            {2, 1, 4, -3},
	                            {1, 0, 5, 0}};
		int n = mat.length;
	 System.out.println( determinantOfMatrix(mat,  n));
	 }
   
	static int determinantOfMatrix(int mat[][], int n) {
        if (n == 1) {
            return mat[0][0]; }
       int D = 0; // Initialize result 
       int N = n;
       int temp[][] = new int[N][N];  // To store cofactors 
       int sign = 1;  // To store sign multiplier 
       // Iterate for each element of first row 
        for (int f = 0; f < n; f++) 
        { 
            // Getting Co-factor of mat[0][f] 
            getCofactor(mat, temp, 0, f, n); 
            D += sign * mat[0][f]  
               * determinantOfMatrix(temp, n - 1); 
            // terms are to be added with  
            // alternate sign 
            sign = -sign; 
        } 
      return D;    
     } 
	
    static void getCofactor(int mat[][], int temp[][], int p, int q, int n) 
    { 
        int i = 0, j = 0; 
        
        for (int row = 0; row < n; row++) { 
            for (int col = 0; col < n; col++) { 
                if (row != p && col != q) { 
                    temp[i][j++] = mat[row][col]; 
                    if (j == n - 1){ 
                        j = 0; 
                        i++; 
                    } 
                    
                } 
            } 
        } 
    } 
    
}


