package practice;

public class Bit_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(countBitsFlip(34,7));
	}
	  public static int countBitsFlip(int a, int b){
	        if(a==b){
	            return 0;
	        }
	      int count = 0; 
	  
	    // Loop until both of them become zero 
	    while (a > 0 || b > 0)  
	    { 
	         // Store the last bits in a 
	        // as well as b 
	        int last_bit_a = a & 1; 
	        int last_bit_b = b & 1; 
	        //System.out.println("last_bit_a :"+last_bit_a);
	        //System.out.println("last_bit_b :"+last_bit_b);
	        
	        // If the current bit is not same 
	        // in both the integers 
	        if (last_bit_a != last_bit_b) {
	            count++; 
	            }
	        
	 // Right shift both the integers by 1 
	        a = a >> 1; 
	        b = b >> 1; 
	       // System.out.println("a :"+a);
	        //System.out.println("b :"+b);
	    } 
	  
	    // Return the count 
	    return count; 
	    
	  }
	    
}
