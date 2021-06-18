package practice;

public class Max_lex_ocuuring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char str[] = "test".toCharArray(); 
        System.out.println("Maximum occurring character = "
                + getMaxOccurringChar(str)); 
	}
       public static char getMaxOccurringChar(char[] str) {
            
            int freq[] = new int[26]; 
            
            // to store maximum frequency 
            int max = -1; 
          // to store the maximum occurring character 
            char result=0;
          // length of 'str' 
            int len = str.length; 
      
            // get frequency of each character of 'str' 
            for (int i = 0; i < len; i++) { 
                if (str[i] != ' ') { 
                	System.out.println(str[i] - 'a');
                    System.out.println("freq :"+freq[str[i] - 'a']);
                    freq[str[i] - 'a']++; 
                    System.out.println("freq :"+freq[str[i] - 'a']);
                } 
            } 
            // for each character, where character is obtained by 
            // (i + 'a') check whether it is the maximum character 
            // so far and accodingly update 'result' 
            for (int i = 0; i < 26; i++) { 
                if (max < freq[i]) { 
                    max = freq[i]; 
                   
                    result = (char) (i + 'a'); 
                    System.out.println("result: "+result);
                } 
            } 
      // maximum occurring character 
            return result; 
    }
}
