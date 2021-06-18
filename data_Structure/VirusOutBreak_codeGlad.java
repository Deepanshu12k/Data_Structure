package data_Structure;

import java.util.Scanner;

public class VirusOutBreak_codeGlad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		 Scanner scan = new Scanner(System.in);

	    	String V = "coronavirus";
	        int n = scan.nextInt(); // test cases  -> 3

	        for(int i =0;i<n;i++){
	      
	        String str = "";
	        /*input ->  abcde
	                           crnas
	                           onarous
	        */
	        String input=scan.next();
	        int j = 0;
	        int k = 0;

	        while(j<V.length() && k<input.length()){
	        	String check = V.substring(j);
	        	String l = ""+input.charAt(k);
	        	if(!check.contains(l)) {
	        		break;
	        	}
	         if(input.charAt(k) == V.charAt(j)){
	           str = str + V.charAt(j);
	           j=j+1;
	           k=k+1;
	         }else{
	            j=j+1;
	         }
	        }
	        
	        if(str.equals(input)){
	            System.out.println("POSITIVE");
	        } else{
	            System.out.println("NEGATIVE");
	        }

	        }
	        scan.close();
	}

}
