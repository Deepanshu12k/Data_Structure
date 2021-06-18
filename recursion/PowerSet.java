package recursion;

import java.util.ArrayList;
import java.util.Collections;

public class PowerSet {

	public static void main(String[] args) {
		String s ="ab"; 
		  String op = "";
		ArrayList<String> al = new ArrayList<>();
		permute(s,op,al);
		
         System.out.println(al);
    }
  
   
    static void permute(String in,String op,ArrayList<String> al){
       if(in.length()==0){
           al.add(op);
           return;
       }
       String out1=op;
       String out2 = op;
       out2 = out2 + in.charAt(0);
       in = in.substring(1);
       permute(in,out1,al);
       System.out.println("op:    "+op);
       System.out.println("in:    "+in);
        permute(in,out2,al);
        System.out.println("op2:    " +op);
        System.out.println("in:    "+in);  
   }
}
