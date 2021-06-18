package practice;

public class Occurrences_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcabcd";
		
		String x = "abcd";
		int j = x.length();
	    String t;
	     for(int i = 0;i<=s.length()-j;i++){
	         t = s.substring(i,i+j);
	         if(t.equals(x)){
	             System.out.println(i);
	         }
	         
	     }
	    
	}

}
