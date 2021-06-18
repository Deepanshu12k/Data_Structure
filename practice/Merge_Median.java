package practice;

public class Merge_Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int a[] = {1,2,3,4,5};
			int	b[] ={3,4,5,6,7,8};
			int n = a.length , m = b.length ;
			int temp=0,i=0,j=0,k=0;
			int[] arr = new int[n+m];
			while(i<n && j<m) {
				if(a[i]<b[j]) {
					arr[k]= a[i];
					i++;
					k++;
				}else {
					arr[k]=b[j];
					j++;
					k++;
				}
			}
			while(i<n) {
				arr[k]=a[i];
				i++;
				k++;
			}
			while(j<m) {
				arr[k]=b[j];
				j++;
				k++;
			}
//			for(int r: arr) {
//				System.out.println(r);
//			}
			 int len = arr.length;
	            int result= 0;
				if(len%2==0) {
			  
			     temp = arr[len/2] + arr[(len/2)-1];
			     
				result =temp/2;
				 
				}else {
				    	
				    	temp = len/2  ;
				    	result = arr[temp];
					}
			System.out.println(result);
		
	}

}
