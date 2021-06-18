package practice2;

//import java.util.ArrayList;
import java.util.Scanner;

public class PPAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		int testCases =  scan.nextInt();
//		ArrayList<Integer> mv = new ArrayList<Integer>();
//		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<testCases;i++) {
			int a =scan.nextInt();
			int b =scan.nextInt();
			int k = scan.nextInt();
			System.out.println(function(a,b,k));
//			System.out.println(", gfg : "+countDivisibles(a,b,k));
		}
		
//			for(int i=0;i<mv.size();i++) {
//				int f=mv.get(i);
//				int g = list.get(i);
//				if(f!=g) {
//				System.out.println("mv"+mv.get(i) + ", list: "+list.get(i) + ",i: " + i);	
//				}
//			}
		
     
		
	scan.close();
	}
	 static int function(int a,int b,int k) {
		       int count = 0;
		       for(int i=a;i<=b;i++) {
			     if(i%k==0)
			      count++;
		        }
		 return count;
	 }
	 static int countDivisibles(int A, int B, int M)
	    {
	        // Variable to store the counter
		 if (A % M == 0)
	            return (B / M) - (A / M) + 1;
	 
	        // A is not divisible by M
	        return (B / M) - (A / M);
	    }
}
