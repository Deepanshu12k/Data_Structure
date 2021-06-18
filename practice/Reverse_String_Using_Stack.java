package practice;
import java.util.*;
public class Reverse_String_Using_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="thank you very much";
		int low =0,high=0;
		Stack<String> stack = new Stack<String>();
		StringBuffer sb = new StringBuffer();
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i) == ' ') {
				System.out.println("Low: "+low);
				System.out.println("high: "+high);
				stack.push(s.substring(low,high+1));
				low=high = i+1;
			}else {
				high = i;
			}
		}
		stack.push(s.substring(low,s.length()));
		
		while(!stack.empty()) {
			sb.append(stack.pop()).append(" ");
		}
		System.out.println(sb);
	}

}
