package data_Structure;

import java.util.Arrays;

public class Stringreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String plainText = "This is test";
    plainText=plainText.trim();
    plainText = plainText.replace(' ', '*');
    char[] arr = plainText.toCharArray();
    boolean[] array=new boolean[plainText.length()];
    Arrays.fill(array,true);
    char c;
    String res = "";
     for(int i =0;i<arr.length-1;i++) {
    	 if(array[i] == true) {
    		c= arr[i];
    		arr[i] = arr[i+1];
    		arr[i+1] = c;
    		
        	array[i]=false;
    	    array[i+1]=false;
    	    res = res+arr[i]+arr[i+1];
    	 }
     }
     System.out.print(res);
     
     }
}
