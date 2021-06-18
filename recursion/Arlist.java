package recursion;

import java.util.ArrayList;

public class Arlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> mv = new ArrayList<Integer>();
  
      for(int i=1;i<6;i++) {
	     mv.add(i);
      }
     int n=mv.size();
     int k = n/2+1;
     
     //main
     for(int i=0;i<n;i+=k) {
	 int left =i;
//	 to handle when k is not an multiple of n
	 int right=Math.min(i+k-1, n-1 );
	 int temp;
//	 reverse the sub-array[left,right]
	 while(left<right) {
		 temp=mv.get(left);
		 
		 mv.set(left, mv.get(right));
		 
		 mv.set(right, temp);
		 
		 left+=1;
		 right-=1;
		 
		 
	 }
     }
  
   System.out.println(mv);
	}

}
