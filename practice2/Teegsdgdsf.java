package practice2;

public class Teegsdgdsf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 hack   h = new hack2();
 hack2   h2 = new hack2();
 hack h1=h;
 h1.hack_method();

	}

}
class hack {
	hack(){
	System.out.println("1");	
	}
	public void hack_method () {
		System.out.println("hack1");
	}
}
class hack2 extends hack{
	hack2(){
		System.out.println("2");	
	}
	public void hack_method ()  {
		System.out.println("hack 2");
	}
}
