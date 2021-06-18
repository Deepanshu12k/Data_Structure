package two_dimensionalArrays;

public class Matrix_Multilplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{4, 8},
		                  {0, 2},
		                  {1, 6}};
		int b[][]={{5, 2},
		                 {9, 4}};
		int arr[][] = new int[a.length][b[0].length];
		  System.out.println("a.length(row1) : "+a.length);
		  System.out.println("b[0].length (column2) : "+b[0].length);
		  System.out.println("b.length (row2) : "+b.length);
		  
		for(int i =0;i<a.length;i++){
	           for(int j =0;j<b[0].length;j++){
	               for(int k = 0;k<b.length;k++){
	                   arr[i][j] +=  a[i][k] * b[k][j]; 
	                   System.out.println("I : "+i);
	                   System.out.println("J: "+j);
	                   System.out.println("K: "+k);
	                   System.out.println("--------");
	               }
	           }
	       }
	       
	       for (int i = 0; i < a.length; i++) { 
	            for (int j = 0; j < b[0].length; j++) 
	                System.out.print(arr[i][j] + " "); 
	  
	            System.out.println(); 
	        } 
	       
	    } 
	}


