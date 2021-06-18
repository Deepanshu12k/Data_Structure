package practice;

import java.math.BigInteger;

public class String_INTO_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		String num = "5";
		BigInteger bi = new BigInteger(num);
		BigInteger i = new BigInteger("7");
       bi = bi.mod(i);
       int n = bi.intValue();
       System.out.println(n);
    		   }

}
//(new java.math.BigInteger(num).mod(new java.math.BigInteger("7"))).intValue();