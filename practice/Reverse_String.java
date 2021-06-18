package practice;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="i.like.this.program.very.much";
		 s = s.replace("."," ");
		    
		    String[] arr = s.split(" ");
		    StringBuffer sb = new StringBuffer();
		    
		    for(int i = arr.length-1;i>=0;i--){
		        sb.append(arr[i]+".");
		    }
		    
		    String to = sb.toString();
		    to = to.replace("."," ");
		    to = to.trim();
		    to = to.replace(" ",".");
	 System.out.print(to);
	}

}
