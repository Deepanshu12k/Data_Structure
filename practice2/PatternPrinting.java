package practice2;

public class PatternPrinting {

	public static void main(String[] args) {
		char[] ch = {'a','b','c','d'};
//		String str = "abcde";
//		
//		for(int i = str.length() ;i>0;i--) {
//			System.out.println(str.substring(0,i));
//		}
//		for(int i = 2;i<str.length()+1;i++) {
//			System.out.println(str.substring(0,i));
//		}
		for(int i=ch.length-1;i>0;i--) {
		  for(int j=0;j<=i;j++) {
			  System.out.print(ch[j]);
		  }
		  System.out.println();
		}
		for(int i=0;i<ch.length;i++) {
			  for(int j=0;j<=i;j++) {
				  System.out.print(ch[j]);
			  }
			  System.out.println();
			}
	}

}
