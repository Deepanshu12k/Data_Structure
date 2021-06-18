package practice2;

public class HACKER {
static {
	code(2);
}
static void code(int val) {
	System.out.println(val+"");
}
HACKER(){
	code(5);
}
static {
	code(4);
}
   {
	code(6);
	}
   static {
	   new HACKER();
   }
   {
	   code(8);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
