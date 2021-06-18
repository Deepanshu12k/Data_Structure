package practice2;

public class Rege {

	public static void main(String[] args) {
		int n =4 ;
		int a = n>>1;
		 System.out.println(1<<4);
      System.out.println(countSetBits(n));
	}
	public static int countSetBits(int n){
	    
	       if(n==0){
	        return 0;
	    }
	    int x = returnX(n);
	        // Your code here
	        // 1 << (x-1)  is equal to 2^(x-1) 
	    int lsb = x * (1 << (x-1));
	    int nsb = n - (1 << x) + 1 ; 
	    int rest = n - (1 << x);
	    int ans= lsb + nsb + countSetBits(rest);
	    
	    return ans;
	        
	    }
	public static int returnX(int n){
        int x= 0 ;
        // 1<<x is equal to 2 power of x(2^x)
       
        while((1 << x) <= n){
        	int c = 1<<x;
        	System.out.println(c+" x"+x);
            x++;
        }
        
        return x-1;
    }
}
