package practice2;

public class Setbits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int m = 4, k = 2;
		   System.out.println(mthSmallestWithKSetBits(m, k));
	}
	static int mthSmallestWithKSetBits(int m, int k)
	{
	    int num = (1 << k) - 1;
	    
	    for (int i = 1; i < m; i++) {
	    	System.out.println("num: "+num);
	        num = nxtHighWithNumOfSetBits(num);
	    }
   return num;
	}
	static int nxtHighWithNumOfSetBits(int x)
	{
	    int rightOne;
	    int nextHigherOneBit;
	    int rightOnesPattern;
	      int next = 0;
	     if (x>0) {
	        rightOne = x & (-x);
	        System.out.println("rightOne: "+rightOne);
	        nextHigherOneBit = x + rightOne;
	        System.out.println("nextHigherOneBit : "+nextHigherOneBit );
	        rightOnesPattern = x ^ nextHigherOneBit;
	        System.out.println("rightOnesPattern: "+rightOnesPattern);
	        rightOnesPattern = (rightOnesPattern) / rightOne;
	        rightOnesPattern=rightOnesPattern >> 2;
	         System.out.println("rightOnesPattern: "+rightOnesPattern);
	        next = nextHigherOneBit | rightOnesPattern;
	        System.out.println("next"+next);
	    }
	  
	    return next;
	}
}
