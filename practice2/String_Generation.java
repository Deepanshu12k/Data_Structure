package practice2;

public class String_Generation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 = "AUA";
		 String s2 = "TFF";
		 String answer="";
		 String modify = s1;
		 int j=0;
		 int count=0;
		 for(int i = 0;i<s2.length();i++) {
			 String s = ""+s2.charAt(i);
			 if(i==0) {
				 int n  = s.compareTo(modify);
				 if(n>0) {
					 answer = modify;
				 }
			 }else {
				 modify = modify.substring(1)+s1.charAt(j);
				 count++;
				 int n  =s.compareTo(modify);
				 if(n>0) {
					answer=answer+s1.charAt(j); 
				 }else {
					 j++;
					 count=0;
				 }
				 if(count==s1.length()-1) {
					 j++;
					 count=0;
				 }
			 }
			 
		 }
		 if(answer.length()>0)
		    System.out.print("answer: " + answer);
		 else
			 System.out.println("-1");
	} 
}
