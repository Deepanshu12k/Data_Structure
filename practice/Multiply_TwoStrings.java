package practice;

public class Multiply_TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "33";
		String b = "2";

		java.math.BigInteger g = new java.math.BigInteger(a);
	    java.math.BigInteger f = new java.math.BigInteger(b);
	     
	   java.math.BigInteger mult ;
	    mult = g.multiply(f);
   

	    String ftr = mult.toString();
	    System.out.println(ftr);
	}

}
//one line solution 
//String str = (new java.math.BigInteger(a).multiply(new java.math.BigInteger(b))).toString();;
//System.out.println(str);