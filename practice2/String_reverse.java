package practice2;

import java.util.Stack;

public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String text = "u love i";
     text=reverse(text);
		System.out.println(text);
	}
	static String reverse(String text){
        Stack<String> stack =  new Stack<>();
        int low =0,high=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                stack.push(text.substring(low,high+1));
                low = high = i+1;
            }else{
                high = i;
            }
        }
        stack.push(text.substring(low));
          text="";

         while(!stack.isEmpty()){
           text = text+stack.peek();
           System.out.println(stack.pop());
         }
return text;
    }
}
