package practice2;

public class MinimumLamps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "....*";
	    int n = s.length();
	     
	    check(n, s);
	}
	static void check(int n, String s)
	{
	      // Create the modified string with
	    // v[i-1] = v[i + 1] = * where s[i] = *
	    char v[] = new char[n];
	    for(int i = 0; i < n; i++){
	        if (s.charAt(i) == '*'){
	            v[i] = '*';
	             // Checking valid index and then replacing
	            // "." with "*" on the surrounding of a *
	            if (i > 0 && i < n - 1){
	                v[i + 1] = '*';
	                v[i - 1] = '*';
	            }
	            if (i == 0 && n != 1){
	                v[i + 1] = '*';
	            }
	            if (i == n - 1 && n != 1){
	                v[i - 1] = '*';
	            }
	        }else{
	            // Just copying if the character is a "."
	            if (v[i] != '*'){
	                v[i] = '.';
	            }
	        }
	    }
	    for(char c:v) {
	    System.out.println("c->"+"["+c+"]");}
	    // Creating the string with the list v
	    String xx = new String(v);
	     // Splitting the string into blocks
	    // with "*" as delimiter
	    String x[] = xx.split("\\*");
	    for(String h :x) {
	    	System.out.println(h);
	    }
	     int ans = 0;
	     
	    for(String xi : x){
	       // Continuing if the string length is 0
	    	System.out.println("length"+xi.length());
	        if (xi.length() == 0){
	            continue;
	        }
	       // Adding number of lamps for each block of "."
	        ans += Math.ceil(xi.length() * 1.0 / 3);
	    }
	    System.out.println(ans);
	}
}
