package practice2;

public class Scaler2ndBinaryQues {
   public static void main(String args[]) {
	   int[] A={3, 4, 4, 6};
		int[]	B= {20, 4, 10, 2};
		int[] ans=solve(A,B);
		for(int i:ans) {
			System.out.print(i+" ");
		}
   }
	 public static int[] solve(int[] A, int[] B) {
		int[] ans = new int[B.length];
		
		for(int i=1;i<A.length;i++) {
			A[i] = A[i]+A[i-1];
		 }
		
		for(int i=0;i<B.length;i++) {
			int cnt = binarySearch(A,B[i]);
			ans[i]=cnt;
		}
	 return ans;
     }
	 static int binarySearch(int[] A, int val) {
		 int count=0;
		 int left = 1,right = A.length;
		 
		 while(left <=right) 
		 {
			 int mid = (right-left)/2+left;
			 if(A[mid-1]>val)
			 {
				 right=mid-1;
			 }else  {
				 count = mid;
				 left=mid+1;
			 }
			 
		 }
		 return count;
	 }
}
