package ghgh;
import java.util.*;
public class PPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n,x;
  Scanner scan = new Scanner(System.in);
  n= scan.nextInt();
  x = scan.nextInt();
  System.out.println(finalCount(n,x));
  scan.close();
	}
public static int finalCount(int n , int x) {
	int score=0;
	int y=n-x;
	
	while(x!=y) {
		
	  if(y>x) {
		  y=y-x;
		  score++;	
	  }
	  if(x>y) {
		  x=x-y;
		  score++;	
	  }
		
	}
	return score;
	
	}

}
