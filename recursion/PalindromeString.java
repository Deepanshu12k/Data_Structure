package recursion;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String d = "malayalam";
    char[] str = d.toCharArray();
    int s= 0;
    int e = str.length-1;
    System.out.println(PalindromeString.isPalindrome(str,s,e));
    
	}
static boolean isPalindrome(char[] str,int s,int e) {
//	if only one element present
	if(s==e) {
	return true;
	}
//	if first and last element are not same 
	if(str[s]!=str[e]) {
		return false;
	}
	 /* If there are more than two characters, check if  
     middle substring is also palindrome or not*/
	if(s<e) {
		return isPalindrome(str,s+1,e-1);
	}
	return true;
}
}
