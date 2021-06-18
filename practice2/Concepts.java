package practice2;

public class Concepts {

	public static void main(String[] args) {
		 int m = 4, k = 2;
		   System.out.println(mthSmallestWithKSetBits(m, k));
	}
	static int mthSmallestWithKSetBits(int m, int k)
	{
	    int num = (1 << k) - 1;
	    
	    for (int i = 1; i < m; i++) {
	    	System.out.println("num: "+num);
	        num = nextNumber(num);
	    }
 return num;
	}
	static int nextNumber(int n)
	{
		int temp,number;
		int temp2;
		int help=0,help2=0;
		temp=n;
		temp2=n;
		while(temp%2!=1)
		{
			temp/=2;
			help++;
		}
		help2=help;
		while(temp%2!=0)
		{
			temp2-=1<<help2;
			temp/=2;
			help2++;
		}
		temp2+=(1<<help2);
		number=help2-help-1;
		int ex=(1<<number)-1;
		temp2+=ex;
		return temp2;
	}
	
}
