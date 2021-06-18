package practice;

import java.util.HashSet;


public class Ip_Validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
//		String iP =" 222.111.111.111";
		String iP = "5555..555";
		if (isValidIP(iP)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}
 
	public static boolean isValidIP(String s) {
       HashSet<Object> allnums = new HashSet<>();
        // allowed segments
        for (int i = 0; i < 256; i++) {
            allnums.add(String.valueOf(i));
        }
         int dots = 0;
        // counting dots
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') 
            	dots++;
        }
        if (dots != 3)
        	return false;
        
        // split according to positions of '.'
        String[] nums = s.split("\\.");
        if (nums.length != 4) 
        	return false;

        for (String x : nums) {
            if (!allnums.contains(x))
            	return false;
        }
        return true;
    }
}
