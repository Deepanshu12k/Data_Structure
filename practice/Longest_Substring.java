package practice;

//import java.util.Arrays;

public class Longest_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "geeksforgeeks";
		String s = "abbcdb";
		int n = s.length();
		int ans = 0,i=0;
        int[] index = new int[128]; 
      
       for (int j = 0; j < n; j++) {
    	   System.out.println("index : "+index[s.charAt(j)]);
    	   
            i = Math.max(index[s.charAt(j)], i);
            
            System.out.println("i : "+i);
            
            int temp =j-i+1;
            System.out.println("temp: "+temp );
          
            ans = Math.max(ans, temp);
            System.out.println("ans: "+ans );
            
            index[s.charAt(j)] = j + 1;
        
        }
	              System.out.println(ans);
	             
	}

}
