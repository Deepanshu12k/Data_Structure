package data_Structure;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		        System.out.print("Enter an integer between 1000 and 9999: ");
		
		        int num = input.nextInt();
		
		        System.out.println("Enter a digit between 0 and 9: ");
		
		        int d = input.nextInt();
	
		        System.out.print("Enter a character: ");
		
		        char ch = input.next().charAt(0);
		        
		        int c1 = ch-1;
		        
		        int c2 = ch+1;
		        
		        int n1 = num/1000;
		        
		        int n2 = (num/10)%10;
		        System.out.println(n2);
		        
		        System.out.println("Result : "+(char)c1 + n1 + d + n2 + d + (char)c2);
              input.close();

	}

}
