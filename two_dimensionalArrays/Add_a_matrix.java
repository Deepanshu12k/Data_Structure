package two_dimensionalArrays;

public class Add_a_matrix {


	public static void main(String[] args) {
		int a[][] = {{1, 2, 3,},
		                   {4, 5, 6}};
		int b[][] = {{1, 3, 3},
		                   {2, 3, 3},
		                    {2,3,4}};
		 if(a.length!=b.length || a[0].length!=b[0].length){ 
	          int brr[][] =  new int[1][1];
		    brr[0][0]=-1;
		   
	        }else {
		 
		int[][] arr = new int[a.length][b[0].length];
		 
		
		for(int i=0;i < a.length;i++){
	           for(int j=0 ; j<b[0].length; j++){
	               arr[i][j]=a[i][j]+b[i][j];
	               System.out.println(arr[i][j]);
	           }
	       }
		
	        }
		
	}

}
