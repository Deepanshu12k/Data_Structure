package recursion;

public class Fibnacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 5;
      System.out.println(fibonacci(len));
	}
	
	public static int  fibonacci(int n)
    {
        if (n < 1) {
          return 0;
        }
        if (n <= 2) {
         return 1;
        }
    int r = fibonacci(n - 1) ;
    System.out.println("r : "+r+" ");
    
    int b = fibonacci(n - 2);
    System.out.println("b : "+b+" ");
   
    
    // logic
    // recursive call
       return r+b ;
    }
}
