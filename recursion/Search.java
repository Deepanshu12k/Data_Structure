package recursion;

public class Search {
	 public static void main(String []args){
	        int[] a= {1,2,3,4,5};
	        int l = 0;
	        int r = a.length-1;
	        int x=3;
	        
	        System.out.println(Search.recursiveSearch(a,l,r,x));
	     }
	     
	     static boolean recursiveSearch(int[] a,int l,int r,int x){
	         if(r<l){
	             return false;
	             }
	             if(a[l]==x){
	              return true;
	          }
	          if(a[r]==x){
	              return true;
	          }
	          return recursiveSearch(a,l+1,r-1,x);
	     }
}
